(ns sicp.in.clojure.newton-test
  (:require [clojure.test :refer :all]
            [sicp.in.clojure.newton :refer :all]))

(deftest sqrt-test
  (testing "sqrt 2 should be 1.4142"
    (is (= (sqrt 2) 1.4142))))

(deftest improve-test
  (testing "improve of original 2 and first guess 1 should be 1.5"
    (is (= (improve 2 1) 1.5)))
  (testing "improve of original 2 and first guess 1.5 should be 1.4167"
    (is (= (improve 2 1.5) 1.4166666666666665)))
  (testing "improve of original 2 and first guess 3 should be 1.4167"
    (is (= (improve 2 3) 1.8333333333333335))))

(deftest good-enough-test
  (testing "should be good enough for 1 and 1.000001"
    (is (= (good-enough 1 1.000001) true)))
  (testing "should be good enough for 1 and 1.00001"
    (is (= (good-enough 1 1.00001) true)))
  (testing "should be good enough for 1.00001 and 1"
    (is (= (good-enough 1.00001 1) true)))
  (testing "should not be good enough for 1.00002 and 1"
    (is (= (good-enough 1.00002 1) false))))

(deftest abs-test
  (testing "abs of 1 - 1.00001 should be 0.00001"
    (is (= (abs (- 1 1.0001)) 0.0001))))

