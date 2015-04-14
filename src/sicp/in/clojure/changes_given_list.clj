(ns sicp.in.clojure.changes-given-list
  (:gen-class))

(defn count-changes
  [x coins]

  (cond (< x 0) 0
        (= x 0) 1
        (empty? coins) 0
        :else (+ (count-changes (- x (first coins)) coins)
                 (count-changes x (rest coins)))))
