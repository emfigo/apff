(defproject lcs_st_clojure "0.1.0"
  :description "Find the longest string S such that all characters of S appear as a substring of each Si in a set"
  :url "https://github.com/emfigo/lcs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot lcs-st-clojure.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
