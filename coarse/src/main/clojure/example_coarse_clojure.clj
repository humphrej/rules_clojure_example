(ns example-coarse-clojure (:gen-class))

(defn myfunc [] "SPECIAL COARSE VALUE")

(defn -main [& args] 
  (println (myfunc )))

