(ns cemerick.foo)

(defn read-bar [x]
  (assert (and (vector? x) (== 2 (count x))))
  (list* 'cemerick.foo/Bar. x))
