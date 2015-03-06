(ns sicp.in.clojure.rational
  (:gen-class)
  (:require [sicp.in.clojure.gcd :refer :all]
            [sicp.in.clojure.newton :refer [abs]]))

(defn make-rat
  [n, d]
  (list n d))

(defn numer
  [r]
  (first r))

(defn denom
  [r]
  (second r))

(defn print-rat
  [r]
  (print (numer r) "/" (denom r))
  r)

(defn add-or-sub
  [operation, x, y]
  (make-rat (operation (* (numer x) (denom y))
                       (* (denom x) (numer y)))
            (* (denom x) (denom y))))

(defn add
  [x, y]
  (add-or-sub + x y))

(defn sub
  [x, y]
  (add-or-sub - x y))

(defn mul
  [x, y]
  (make-rat (* (numer x) (numer y))
            (* (denom x) (denom y))))

(defn div
  [x, y]
  (make-rat (* (numer x) (denom y))
            (* (denom x) (numer y))))

(defn equal?
  [x, y]
  (= (* (numer x) (denom y))
     (* (denom x) (numer y))))
