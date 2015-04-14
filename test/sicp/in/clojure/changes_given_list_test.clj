(ns sicp.in.clojure.changes-given-list-test
  (:require [clojure.test :refer :all]
            [sicp.in.clojure.changes-given-list :refer :all]))

(def us-coins
  '(50 25 10 5 1))

(deftest count-changes-test
  (testing "1 cent should have 1 kind"
    (is (= (count-changes 1 us-coins) 1)))
  (testing "3 cents should have 1 kinds"
    (is (= (count-changes 3 us-coins) 1)))
  (testing "6 cents should have 2 kinds"
    (is (= (count-changes 6 us-coins) 2)))
  (testing "10 cents should have 4 kinds"
    (is (= (count-changes 10 us-coins) 4)))
  (testing "100 cents should have 292 kinds"
    (is (= (count-changes 100 us-coins) 292))))
