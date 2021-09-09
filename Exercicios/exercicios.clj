;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1000
(println "Hello World!")



;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1001
(def input1 (read-line))
(def input2 (read-line))

(println "X =" (+ (Long/parseLong input1)  (Long/parseLong input2)))



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


;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1004
(def A (Integer/parseInt (read-line)))
(def B (Integer/parseInt (read-line)))

(defn calcula-produto
  [A B]
  (* A B))

(println "PROD =" (calcula-produto A B))



;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1005
(def A (Double/parseDouble (read-line)))
(def B (Double/parseDouble (read-line)))

(defn calcular-media
  [A B]
  (let [peso-A (* A 3.5)
        peso-B (* B 7.5)
        peso-total 11.0]
    (/ (+ peso-A peso-B) peso-total)))

(println "MEDIA =" (format "%.5f" (calcular-media A B)))



;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1006
(def A (Double/parseDouble (read-line)))
(def B (Double/parseDouble (read-line)))
(def C (Double/parseDouble (read-line)))

(defn calcula-media
  [A B C]
  (let [peso-A (* A 2)
        peso-B (* B 3)
        peso-C (* C 5)]
    (/ (+ peso-A peso-B peso-C) 10)))

(println "MEDIA = " (calcula-media A B C))


;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1007
(def A (Integer/parseInt (read-line)))
(def B (Integer/parseInt (read-line)))
(def C (Integer/parseInt (read-line)))
(def D (Integer/parseInt (read-line)))

(defn calcula-diferenca
  [A B C D]
    (-(* A B) (* C D)))

(println "DIFERENCA = " (calcula-diferenca A B C D))
