(ns sicp.in.clojure.rational-test
  (:require [clojure.test :refer :all]
            [sicp.in.clojure.rational :refer :all]))

(def one-second (make-rat 1 2))

(def one-third (make-rat 1 3))

(def one-sixth (make-rat 1 6))

(def five-sixth (make-rat 5 6))

(def three-second (make-rat 3 2))

(def two-fourth (make-rat 2 4))

(deftest rational-test
  (testing "1/2 + 1/3 = 5/6"
    (is (= (add one-second one-third) five-sixth)))
  (testing "2/4 + 1/3 = 5/6"
    (is (= (add one-second one-third) five-sixth)))
  (testing "1/2 - 1/3 = 1/6"
    (is (= (sub one-second one-third) one-sixth)))
  (testing "1/2 * 1/3 = 1/6"
    (is (= (mul one-second one-third) one-sixth)))
  (testing "1/2 / 1/3 = 3/2"
    (is (= (div one-second one-third) three-second)))
  (testing "1/2 == 2/4"
    (is (equal? one-second two-fourth))))
