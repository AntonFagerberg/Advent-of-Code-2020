(ns aoc2020.day02-test
  (:require
    [clojure.test :refer :all]
    [aoc2020.day02 :refer :all]
    [clojure.string :as str]))

(def input
  (str/split (slurp (clojure.java.io/resource "day02")) #"\n"))

(def example ["1-3 a: abcde"
              "1-3 b: cdefg"
              "2-9 c: ccccccccc"])

(deftest day02-test
  (testing "part 1 parse"
    (is (= [1 3 \a "abcde"] (parse "1-3 a: abcde"))))
  (testing "part 1 valid"
    (is (= true (valid [1 3 \a "abcde"]))))
  (testing "part 1 example"
    (is (= 2 (solve example valid))))
  (testing "part 1"
    (is (= 643 (solve input valid))))
  (testing "part 2 ok"
    (is (= true (valid2 [1 3 \c "abcde"]))))
  (testing "part 2 not ok"
    (is (= false (valid2 [1 3 \b "cdefg"]))))
  (testing "part 2 not ok either"
    (is (= false (valid2 [2 9 \c "ccccccccc"]))))
  (testing "part 2"
    (is (= 388 (solve input valid2)))))