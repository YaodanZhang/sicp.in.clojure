(ns sicp.in.clojure.list-ref-test
  (:require [clojure.test :refer :all]
            [sicp.in.clojure.list-ref :refer :all]))

(deftest list-ref-test
  (testing "get tail element"
    (is (= (list-ref '(1) 0) 1))
    (is (= (list-ref '(2 3 4) 2) 4))))

(deftest append-test
  (testing "two list can be appended to one"
    (is (= (append '() '()) '()))
    (is (= (append '(1 2) '()) '(1 2)))
    (is (= (append '() '(1 2)) '(1 2)))
    (is (= (append '(1) '(2 3)) '(1 2 3)))))

(deftest my-reverse-test
  (testing "can reverse a collection of items"
    (is (= (my-reverse ()) ()))
    (is (= (my-reverse '(1)) '(1)))
    (is (= (my-reverse '(1 2)) '(2 1)))
    (is (= (my-reverse-classic ()) ()))
    (is (= (my-reverse-classic '(1)) '(1)))
    (is (= (my-reverse-classic '(1 2)) '(2 1)))))
