(ns sicp.in.clojure.same-parity-test
  (:require [clojure.test :refer :all]
            [sicp.in.clojure.same-parity :refer :all]))

(deftest same-parity-test
  (testing "should return same parity numbers"
    (is (= (same-parity 1 2 3 4 5) '(1 3 5)))
    (is (= (same-parity 2 3 4 5 6) '(2 4 6)))))

(deftest same-parity-with-filter-test
  (testing "should return same parity numbers"
    (is (= (same-parity-with-filter 1 2 3 4 5) '(1 3 5)))
    (is (= (same-parity-with-filter 2 3 4 5 6) '(2 4 6)))))
