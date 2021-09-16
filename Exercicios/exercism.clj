;;https://exercism.org/tracks/clojure/exercises/tracks-on-tracks-on-tracks
defn new-list
  "Creates an empty list of languages to practice."
  []
  (list))

(defn add-language
  [lang lang-list]
    (conj lang-list lang))

(defn first-language
  "Returns the first language on the list."
  [lang-list]
  (first lang-list))

(defn remove-language
  "Removes the the last language added to the list."
  [lang-list]
  (drop 1 lang-list))

(defn count-languages
  "Returns the total number of languages on the list."
  [lang-list]
  (count lang-list))

(defn learning-list
  "Creates an empty list, adds Clojure and Lisp, removes Lisp, adds
  Java and JavaScript, then finally returns a count of the total number
  of languages."
  []
  (new-list)
  (add-language "Clojure" '("Lisp"))
  (remove-language '("Lisp" "Clojure"))
  (add-language "Java" '("JavaScript"))
  (count-languages '("Java" "JavaScript" "Clojure")))

;;https://exercism.org/tracks/clojure/exercises/cars-assemble
(defn production-rate
  [speed]
  (cond (= speed 0) 0.0
        (<= speed 4) (* speed 221.0)
        (<= speed 8) (* (* speed 221) 0.9)
        (= speed 9) (* (* speed 221) 0.8)
        (= speed 10) (* (* speed 221) 0.77)))

(defn working-items
  [speed]
  (let [production-per-minute (/ (production-rate speed) 60)]
    (int production-per-minute)))

(println (working-items 6))


;;https://exercism.org/tracks/clojure/exercises/bird-watcher
(defn today [birds]
  (last birds))

(defn inc-bird [birds]
  (let [inc-one-bird (inc (last birds))
        new-vector (pop birds)]
    (conj new-vector inc-one-bird)))

(defn day-without-birds? [birds]
  (let [zero-birds (some #(= 0 %) birds)]
    (some? zero-birds)))

(defn n-days-count [birds n]
  (let [splitted-vector (split-at n birds)]
    (reduce + (get splitted-vector 0))))

(defn busy-days [birds]
  (let [get-busy-days (filter #(>= % 5) birds)]
    (count get-busy-days)))

(defn odd-week? [birds]
  (let [expected [1 0 1 0 1 0 1]]
    (= birds expected)))

(def birds-per-day [2 5 5 7 4 1])
(println (today birds-per-day))
(println (inc-bird birds-per-day))
(println (day-without-birds? birds-per-day))
(println (n-days-count birds-per-day 4))
(println (busy-days birds-per-day))
(println (odd-week? [1 0 1 0 1 0 1]))
