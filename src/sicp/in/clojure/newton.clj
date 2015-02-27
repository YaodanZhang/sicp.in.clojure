(ns sicp.in.clojure.newton
  (:gen-class))

(defn improve
  [input, guess]
  (/ (+ (/ input guess) guess) 2.0))

(defn abs
  [x]
  (if (< x 0)
    (- 0 x)
    x))

(defn good-enough
  [x, y]
  (if (> (abs (- x y)) 0.00001M)
    false
    true))

(defn sqrt-with-guess
  [input, guess]
  ())

(defn sqrt
  [input]
  (sqrt-with-guess input 1))
