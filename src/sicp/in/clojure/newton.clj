(ns sicp.in.clojure.newton
  (:gen-class))

(defn average
  [x, y]
  (/ (+ x y) 2.0))

(defn abs
  [x]
  (if (< x 0)
    (- 0 x) x))

(defn square
  [x]
  (* x x))

(defn sqrt
  [input]

  (defn improve
    [input, guess]
    (average (/ input guess) guess))

  (defn good-enough
    [input, guess]
    (if (> (abs (- input (square guess))) 0.000000001)
      false true))

  (defn sqrt-with-guess
    [input, guess]
    (if (good-enough input guess)
      guess (sqrt-with-guess input (improve input guess))))

  (sqrt-with-guess input 1))
