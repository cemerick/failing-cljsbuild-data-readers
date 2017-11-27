(ns cemerick.foo
  (:require-macros cemerick.foo))

(enable-console-print!)

(defrecord Bar [a b])

(def k #bar[1 2])

(println "we made a Bar:" k)