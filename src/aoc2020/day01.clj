(ns aoc2020.day01
  (:require [clojure.math.combinatorics :as combi]))

(defn solve [input n]
  (map #(reduce * %)
       (filter
         #(== 2020 (reduce + %))
         (combi/combinations input n))))