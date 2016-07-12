(ns klp.core
  (:gen-class))

(defn build-path
  [[leaf-value leaf-children]]()
  (if (keyword? leaf-children)
    (conj nil [leaf-value])
    (when (map? leaf-children)
      (let [leaves (apply concat (remove nil? (map build-path leaf-children)))]
        (when-not (empty? leaves)
          (map #(concat [leaf-value] %) leaves))))))

(defn -main
  "Find the path for all the leafs that are keywords"
  [& args]
  (let [m (read-string (first args))]
    (println "KLP -> " (set (apply concat (remove nil? (map build-path m)))))))
