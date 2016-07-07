(ns lcs-st-clojure.core
  (:gen-class))

(defn generate-suffixes
  "Generate suffix for the string specified as a parameter"
  [word]
  (if (empty? word)
    '()
    (conj (generate-suffixes (subs word 1)) (str word "$"))))

(defn add-to-trie
  "Adss to trie all the characters of the suffix"
  [suffix trie]
  (let [first-char (first (map str suffix))]
    (if (empty? first-char)
      trie
      (assoc trie
             first-char
             (add-to-trie (subs suffix 1) (or (get trie first-char) {}))))))


(defn build-trie
  "Builds a trie with the list of suffixes passed as parameters"
  ([suffixes] (build-trie suffixes {}))
  ([suffixes trie]
   (if (empty? suffixes)
     trie
     (build-trie (rest suffixes) (add-to-trie (first suffixes) trie)))))


(defn compact-trie
  "Compacts the trie to build a tree with all the suffixes present in the trie"
  ([trie] (compact-trie trie []))
  ([trie tree]
   (cond
     (empty? trie) (clojure.string/join tree)
     (> (count trie) 1) (concat [(clojure.string/join tree)] (map #(compact-trie (last %) (list (first %))) trie))
     :else (let [key (first (keys trie))]
             (compact-trie (get trie key) (conj (vec tree) key))))
   ))


(def lcs (atom []))

(defn -main
  "Longest Common Substring using Suffix Tree. Pass each string in the set
  as an argument to the function. Main will return the set of LCS found"
  [& args]
  (let [strings (set args)
        suffixes (distinct (flatten (map generate-suffixes strings)))
        substrings (sort-by count > (distinct
                                   (map #(clojure.string/replace % "$" "")
                                        (flatten
                                         (compact-trie
                                          (build-trie suffixes))))))]
    (doseq [substring substrings]
      (when (every? #(clojure.string/includes? % substring) strings)
        (swap! lcs conj substring)))
    (println "LCS -> " (set (filter #(= (count %) (count (first @lcs))) @lcs)))))

