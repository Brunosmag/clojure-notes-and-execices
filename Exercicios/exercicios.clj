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
