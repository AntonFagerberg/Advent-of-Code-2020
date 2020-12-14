(ns aoc2020.day02)

(defn parse [input]
  (let [parts (re-matches #"(\d+)-(\d+) ([a-z]): (\w+)" input)]
    [(Integer/parseInt (get parts 1))
     (Integer/parseInt (get parts 2))
     (get (get parts 3) 0)
     (get parts 4)]))

(defn valid [[min max c i]]
  (<= min (count (filter #(= % c) i)) max))

(defn valid2 [[a b c i]]
  (let [aa (get i (- a 1)) bb (get i (- b 1))]
    (and (not= aa bb) (or (= aa c) (= bb c)))))

(defn solve [input f]
  (count
    (filter
      #(= % true)
      (map f
           (map #(parse %) input)))))