(ns sicp.in.clojure.changes
  (:gen-class))

(defn changes-of
  [index]
  (cond (= index 1) 1
        (= index 2) 5
        (= index 3) 10
        (= index 4) 25
        (= index 5) 50
        :else (throw (IllegalArgumentException. "there are only 5 kinds of changes."))))

(defn count-changes
  [x]

  (defn cc-iter
    [rest, types]
    (cond (< rest 0) 0
          (= rest 0) 1
          (< types 1) 0
          :else (+ (cc-iter (- rest (changes-of types)) types)
                   (cc-iter rest (- types 1)))))

  (cc-iter x 5))
