(defn ticket-price [age day hour]
  (cond
    (or (< age 10) (>= age 65)) 4.00
    (or (= day 1) (= day 2) (= day 4)) 6.00
    (and (>= hour 12) (<= hour 14)) 7.50
    :else 8.50))

(ticket-price 20 1 16)
