(ns build
  (:require cljs.build.api))

(defn -main []
  (cljs.build.api/build "src"
                        '{:main cemerick.foo
                          :output-to "target/out-min/min.js"
                          :output-dir "target/out-min"
                          :optimizations :advanced
                          :pretty-print false
                          :target :nodejs}))