(defproject foo/bar "0.0.1-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0-beta2"]
                 [org.clojure/clojurescript "1.9.946"]]
  :plugins [[lein-cljsbuild "1.1.7" :exclusions [org.clojure/clojure]]]
  :cljsbuild {:builds
              {"min" {:source-paths ["src"]
                      :compiler {:main cemerick.foo
                                 :output-to "target/out-min/min.js"
                                 :output-dir "target/out-min"
                                 :optimizations :advanced
                                 :pretty-print false
                                 :target :nodejs}}}})
