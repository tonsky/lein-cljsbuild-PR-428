(defproject lein-cljsbuild-PR-428 "0.1.0-SNAPSHOT"
  :dependencies [
    [org.clojure/clojure       "1.7.0"]
    [org.clojure/clojurescript "1.7.170"]
  ]
  :plugins [
    [lein-cljsbuild "1.1.1"]
  ]
  
  :cljsbuild {
    :builds [
      { :id "none"
        :source-paths ["src"]
        :compiler {
          :output-to     "target/main.js"
          :optimizations :none
        } }
  ]})
