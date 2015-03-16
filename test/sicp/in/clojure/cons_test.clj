(ns sicp.in.clojure.cons-test
  (:require [clojure.test :refer :all]
            [sicp.in.clojure.cons :refer :all]))

(deftest my-cons-test
  (testing "cons 1: labmda expression"
    (is (= (car1 (cons1 17 29)) 17))
    (is (= (cdr1 (cons1 17 29)) 29)))
  (testing "cons 2: selector"
    (is (= (car2 (cons2 17 29)) 17))
    (is (= (cdr2 (cons2 17 29)) 29)))
  (testing "cons 3: math"
    (is (= (car3 (cons3 17 29)) 17))
    (is (= (cdr3 (cons3 17 29)) 29))))
