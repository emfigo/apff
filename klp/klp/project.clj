(defproject klp "0.1.0-SNAPSHOT"
  :description "Path for all leafs that are keywords"
  :url "https://github.com/emfigo/apff/tree/master/klp"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot klp.core
  :uberjar-name "klp-0.1.0.jar"
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
