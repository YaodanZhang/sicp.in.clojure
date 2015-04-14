(ns sicp.in.clojure.same-parity)

(defn mod-2
  [x]
  (mod x 2))

(defn same-parity
  [a & coll]

  (def mod-to-select
    (mod-2 a))

  (defn same-parity-rec
    [coll]
    (cond (empty? coll) coll
          (= (mod-2 (first coll)) mod-to-select)
              (cons (first coll) (same-parity-rec (rest coll)))
          :else (same-parity-rec (rest coll))))

  (cons a (same-parity-rec coll)))

(defn same-parity-with-filter
  [a & coll]

  (defn same-by
    [func]
    (fn [a] (fn [b] (= (func a) (func b)))))

  (cons a (filter ((same-by mod-2) a) coll)))
