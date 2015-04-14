(ns sicp.in.clojure.fibonacci-test
  (:require [clojure.test :refer :all]
            [sicp.in.clojure.fibonacci :refer :all]))

(deftest fib-recursive-test
  (testing "test fibonacci 0"
    (is (= (fib-recursive 0) 1)))
  (testing "test fibonacci 1"
    (is (= (fib-recursive 1) 1)))
  (testing "test fibonacci 2"
    (is (= (fib-recursive 2) 2)))
  (testing "test fibonacci 3"
    (is (= (fib-recursive 3) 3)))
  (testing "test fibonacci 4"
    (is (= (fib-recursive 4) 5)))
  (testing "test fibonacci 5"
    (is (= (fib-recursive 5) 8)))
  (testing "test fibonacci 10"
    (is (= (fib-recursive 10) 89))))

(deftest fib-iter-test
  (testing "test fibonacci iter 0"
    (is (= (fib-iter 0) 1)))
  (testing "test fibonacci iter 1"
    (is (= (fib-iter 1) 1)))
  (testing "test fibonacci iter 2"
    (is (= (fib-iter 2) 2)))
  (testing "test fibonacci iter 3"
    (is (= (fib-iter 3) 3)))
  (testing "test fibonacci iter 4"
    (is (= (fib-iter 4) 5)))
  (testing "test fibonacci iter 5"
    (is (= (fib-iter 5) 8)))
  (testing "test fibonacci iter 10"
    (is (= (fib-iter 10) 89)))
  (testing "test fibonacci iter 50"
    (is (= (fib-iter 50) 20365011074))))
