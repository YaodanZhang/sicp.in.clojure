(ns sicp.in.clojure.fibonacci
  (:gen-class))

(defn fib-recursive
  [n]
  (cond (= n 0) 1
        (= n 1) 1
        :else (+ (fib-recursive (- n 1)) (fib-recursive (- n 2)))))

(defn fib-iter
  [n]

  (defn fib-iter-rec
    [a, b, m]
    (if (= m 0) a (fib-iter-rec (+ a b) a (- m 1))))

  (fib-iter-rec 1 0 n))
