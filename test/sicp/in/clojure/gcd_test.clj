(ns sicp.in.clojure.gcd-test
  (:require [clojure.test :refer :all]
            [sicp.in.clojure.gcd :refer :all]))

(deftest gcd-test
  (testing "4, 2 -> 2"
    (is (= (gcd 4 2) 2)))
  (testing "2, 4 -> 2"
    (is (= (gcd 2 4) 2)))
  (testing "93, 45 -> 3"
    (is (= (gcd 93 45) 3)))
  (testing "70, 105 -> 35"
    (is (= (gcd 70, 105) 35))))
