(ns fibonacci-sequence.core
  (:gen-class))

(defn fib [n]
  (letfn [(fib [curr next n]
          (if (zero? n)
            curr
            (recur next (+ curr next) (dec n))))] ;tail recursion
    (fib 0N 1N n)))

(defn -main [& args]
  ;Q1: Find out 1,000 Fib digits and sum then
  (println "Answer of Q1: ")
  (println (fib 1000))
  ;Q1: Find out 1,000,000 Fib digits and sum then
  (println "Answer of Q2: ")
  (println (fib 1000000)))