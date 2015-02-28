(ns sicp.in.clojure.newton-test
  (:require [clojure.test :refer :all]
            [sicp.in.clojure.newton :refer :all]))

(deftest sqrt-test
  (testing "sqrt 2 should be 1.4142"
    (is (= (sqrt 2) 1.4142135623746899))))
