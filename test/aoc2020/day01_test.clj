(ns aoc2020.day01-test
  (:require
    [clojure.test :refer :all]
    [aoc2020.day01 :refer :all]
    [clojure.string :as str]))

(def input
  (map #(Integer/parseInt %)
       (str/split
         (slurp (clojure.java.io/resource "day01"))
         #"\n")))

(def example [1721 979 366 299 675 1456])

(deftest day01-test
  (testing "part 1 example input"
    (is (= [514579] (solve example 2))))
  (testing "part 1"
    (is (= [889779] (solve input 2))))
  (testing "part 2 example input"
    (is (= [241861950] (solve example 3))))
  (testing "part 2"
    (is (= [76110336] (solve input 3)))))
