(ns sicp.in.clojure.church
  (:gen-class))

(def church-0
  (fn [f] (fn [x] x)))

(defn church-add-1
  [n]
  (fn [f] (fn [x] (f ((n f) x)))))

(def church-1
  (fn [f] (fn [x] (f x))))

(def church-2
  (fn [f] (fn [x] (f (f x)))))

(def church-10
  (fn [f] (fn [x] (f (f (f (f (f (f (f (f (f (f x)))))))))))))

(defn show-church
  [n]
  ((n (fn [x] (+ x 1))) 0))

(defn church-add
  [a, b]
  (fn [f] (fn [x] ((a f) ((b f) x)))))
