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




;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1008
(def funcionario-id (Integer/parseInt (read-line)))
(def quantidade-horas (Integer/parseInt (read-line)))
(def salario (Double/parseDouble (read-line)))

(defn calcula-salario
  [horas salario]
  (* horas salario))

(println "NUMBER = " funcionario-id)
(println "SALARY = U$" (format "%.2f" (calcula-salario quantidade-horas salario)))



;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1009
(def nome (read-line))
(def salario (Double/parseDouble (read-line)))
(def total-vendas (Double/parseDouble (read-line)))

(defn calcula-salario-com-comissao
  [salario total-vendas]
  (let [percentual-comissao (/ 15 100)
        valor-commisionado (* total-vendas percentual-comissao)]
    (+ salario valor-commisionado)))

(def salario-formatado (format "%.2f" (calcula-salario-com-comissao salario total-vendas)))
(println "TOTAL = R$" salario-formatado)


;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1010
(def primeira-entrada (read-line))
(def segunda-entrada (read-line))

(def vetor-primeira-entrada (str/split primeira-entrada #" "))
(def vetor-segunda-entrada (str/split segunda-entrada #" "))

(defn calcula-valores
  [[_ quantidade valor]]
  (* (Integer/parseInt quantidade) (Double/parseDouble valor)))

(def resumo-primeiro-pedido (calcula-valores vetor-primeira-entrada))
(def resumo-segundo-pedido (calcula-valores vetor-segunda-entrada))
(def total-pedido (+ resumo-primeiro-pedido resumo-segundo-pedido))

(println "VALOR A PAGAR: R$" (format "%.2f" total-pedido))



;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1011
(def entrada (Integer/parseInt (read-line)))

(defn calcula-esfera
  [raio]
  (let [pi 3.14159
        raio-elevado (math/expt raio 3)
        primeira-parte-formula (/ 4 3.0)]
    (* primeira-parte-formula pi raio-elevado)))

(println "VOLUME = "(format "%.3f" (calcula-esfera entrada)) )

;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1012
  (:require [clojure.math.numeric-tower :as math]
            [clojure.string :as str]))

(def entrada (read-line))
(def vetor-entrada (str/split entrada #" "))

(defn calcula-triangulo
  [altura base]
  (let [altura-double (Double/parseDouble altura)
        base-double (Double/parseDouble base)]
    (/ (* base-double altura-double) 2)))

(def triangulo (calcula-triangulo (get vetor-entrada 0) (get vetor-entrada 2)))
(println "TRIANGULO:" (format "%.3f" triangulo))

(defn calcula-circulo
  [c]
  (let [pi 3.14159
        c-elevado (math/expt (Double/parseDouble c) 2)]
    (* pi c-elevado)))

(def circulo (calcula-circulo (get vetor-entrada 2)))
(println "CIRCULO:" (format "%.3f" circulo))

(defn calcula-trapezio
  [[a b c]]
  (let [double-a (Double/parseDouble a)
        double-b (Double/parseDouble b)
        double-c (Double/parseDouble c)]
    (* (/ (+ double-a double-b) 2) double-c)))

(def trapezio (calcula-trapezio vetor-entrada))
(println "TRAPEZIO:" (format "%.3f" trapezio))

(defn calcula-quadrado
  [c]
  (let [double-c (Double/parseDouble c)]
    (math/expt double-c 2)))

(def quadrado (calcula-quadrado (get vetor-entrada 1)))
(println "QUADRADO:" (format "%.3f" quadrado))

(defn calcula-retangulo
  [a b]
  (let [double-a (Double/parseDouble a)
        double-b (Double/parseDouble b)]
    (* double-a double-b)))

(def retangulo (calcula-retangulo (get vetor-entrada 0) (get vetor-entrada 1)))
(println "RETANGULO:" (format "%.3f" retangulo))



;;https://www.urionlinejudge.com.br/judge/pt/problems/view/1013
(def entrada (read-line))
(def vetor-entrada (str/split entrada #" "))

(defn converte-em-int
  [value]
  (Integer/parseInt value))

(def vetor-entrada-int (map converte-em-int vetor-entrada))
(println (reduce max vetor-entrada-int) "é o maior.")
