(ns sicp.in.clojure.list-ref
  (:gen-class))

(defn list-ref
  [items n]
  (if (zero? n)
    (first items)
    (list-ref (rest items) (dec n))))

(defn append
  [a b]
  (if (empty? a)
    b
    (cons (first a) (append (rest a) b))))

(defn my-reverse
  [items]
  (if (empty? items)
    items
    (append (my-reverse (rest items)) (cons (first items) '()))))

(defn my-reverse-classic
  [items]
  (reduce conj '() items))
