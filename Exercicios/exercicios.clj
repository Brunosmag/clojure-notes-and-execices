;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1002
(require '[clojure.math.numeric-tower :as math])

(def entrada (Double/parseDouble (read-line)))

(defn calcula-area
  [raio]
  (let [n 3.14159
        raio-ao-quadrado (math/expt raio 2)]
    (* raio-ao-quadrado n)))

(def resposta (calcula-area entrada))
(def resposta-formatada (print-str "A=" (format "%.4f" resposta)))
(println (clojure.string/replace resposta-formatada " " ""))