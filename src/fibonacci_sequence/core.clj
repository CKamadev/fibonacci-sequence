(ns fibonacci-sequence.core
  (:gen-class))

(defn fib [n]
  (letfn [(fib [curr next n]
          (if (zero? n)
            curr
            (recur next (+ curr next) (dec n))))]
    (fib 0N 1N n)))

(defn -main [& args]
  (println "Answer of Q1: ")
  (println (fib 1000))
  (println "Answer of Q2: ")
  (println (fib 1000000)))