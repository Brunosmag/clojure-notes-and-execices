(def entrada (read-line))
(def vetor-entrada (str/split entrada #" "))

(def maior-ate-agora 0)

(defn meu-max
  [valores]
  (let [primeiro (first valores)]
    (if (not (nil? primeiro))
      (if (> primeiro maior-ate-agora)
        (do
          (def maior-ate-agora primeiro)
          (recur (meu-max (rest valores)))))
      )))

(defn converte-double
  [valor]
  (Integer/parseInt valor))

(meu-max (map converte-double vetor-entrada))
(println "maior" maior-ate-agora)
