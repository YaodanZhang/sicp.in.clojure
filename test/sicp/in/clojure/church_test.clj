(ns sicp.in.clojure.church-test
  (:require [clojure.test :refer :all]
            [sicp.in.clojure.church :refer :all]))

(deftest church-test
  (testing "test church number"
    (is (= (show-church church-0) 0))
    (is (= (show-church church-1) 1))
    (is (= (show-church church-2) 2))
    (is (= (show-church church-10) 10)))
  (testing "test operation"
    (is (= (show-church (church-add-1 church-10)) 11))
    (is (= (show-church (church-add church-2 church-10)) 11))))

