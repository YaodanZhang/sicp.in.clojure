(ns sicp.in.clojure.cons
  (:gen-class))

(defn cons1
  [a, b]
  (fn [m]
    (if (= m 0) a b)))

(defn car1
  [c]
  (c 0))

(defn cdr1
  [c]
  (c 1))

(defn cons2
  [a, b]
  (fn [f] (f a b)))

(defn car2
  [c]
  (c (fn [a, b] a)))

(defn cdr2
  [c]
  (c (fn [a, b] b)))

(defn cons3
  [a, b]

  (defn sqr
    [x, n]
    (cond (= n 0) 1
          (= n 1) x
          (> n 1) (* x (sqr x (- n 1)))
          :else (throw (.IllegalArgumentException "wrong param"))))

  (* (sqr 2 a) (sqr 3 b)))

(defn count-of-a
  [x, a]

  (defn iter
    [x, n]
    (if (= 0 (mod x a)) (iter (/ x a) (+ n 1)) n))

  (iter x 0))

(defn car3
  [c]
  (count-of-a c 2))

(defn cdr3
  [c]
  (count-of-a c 3))
