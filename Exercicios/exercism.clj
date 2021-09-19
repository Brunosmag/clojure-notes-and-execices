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


;;https://exercism.org/tracks/clojure/exercises/interest-is-interesting/edit
(defn interest-rate
  [balance]
  (cond (< balance 0) -3.213
        (< balance 1000) 0.5
        (< balance 5000) 1.621
        :else 2.475 ))

(defn annual-balance-update
  [balance]
  (let [rate-percent (/ (interest-rate balance) 100.00)
        interest-plus (* balance rate-percent)]
    (bigdec(+ balance interest-plus))))

(defn amount-to-donate
  [balance tax-free-percentage]
  (let [tax-free-calculated-percentage (/ tax-free-percentage 100.00)
        balance-tax (* balance tax-free-calculated-percentage)]
    (if (<= balance 0)
      0
      (int (* balance-tax 2)))))

;;https://exercism.org/tracks/clojure/exercises/annalyns-infiltration
(defn can-fast-attack?
  "Returns true if a fast-attack can be made, false otherwise."
  [knight-awake?]
  (if knight-awake? false true))

(defn can-spy?
  "Returns true if the kidnappers can be spied upon, false otherwise."
  [knight-awake? archer-awake? prisoner-awake?]
  (cond
    knight-awake? true
    archer-awake? true
    prisoner-awake? true
    :else false))

(defn can-signal-prisoner?
  "Returns true if the prisoner can be signalled, false otherwise."
  [archer-awake? prisoner-awake?]
  (cond
    archer-awake? false
    (not prisoner-awake?) false
    :else true))

(defn can-free-prisoner?
  "Returns true if prisoner can be freed, false otherwise."
  [knight-awake? archer-awake? prisoner-awake? dog-present?]
  (cond
    (and knight-awake? archer-awake?) false
    (and (not dog-present?) (or knight-awake? archer-awake?)) false
    (and (not knight-awake?) (not archer-awake?) (not prisoner-awake?) (not dog-present?)) false
    (and archer-awake? dog-present?) false
    (and prisoner-awake? (not knight-awake?) (not archer-awake?)) true
    (and (not archer-awake?) dog-present?) true))
