(ns aoc2020.day01.day01)

(require '[clojure.math.combinatorics :as combo])

(defn solve [input n]
  (map #(reduce * %)
       (filter
         #(== 2020 (reduce + %))
         (combo/combinations input n))))