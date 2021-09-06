;;normal que funções que retornam true/false tenham um "?" no final do seu nome.
;;são conhecidas como predicate.
(defn aplica-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

;;nil é considerado false.

;;when trabalha apenas com a condicional de verdade, não existe else.
(defn aplica-desconto?
  [valor-bruto]
  (when (> valor-bruto 100)
    true))

;;também podemos trabalhar com a versão simplificado para esses casos.
(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))

;;lookup (a busca de uma função por outra) é executado em tempo de execução.

;;funções podem ser passadas como parametros para outras.
;; são conhecidas como High Order Functions (recebem uma função como parametro ou retornam uma)
(defn mais-caro-que-100?
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  [aplica? valor-bruto]
  if (aplica? valor-bruto)
  (let [taxa-de-desconto (/ 10 100)
        desconto (* valor-bruto taxa-de-desconto)]
    (- valor-bruto desconto))
  valor-bruto))

(println (valor-descontado mais-caro-que-100? 1000))

;;podemos utilizar funções anonimas (também conhecido como lambdas)
(println (valor-descontado (fn [v] (> v 100)) 1000))

;;ou ainda podemos remover a declaração da função utilizando # e obtendo diretamente os argumento com %1 onde %1 é igual o primeiro parametro.
(println (valor-descontado #(> %1 100) 1000))

;;também podemos definir simbolos (e não funções com defn) como funções.
(def mais-caro-que-100? (fn [valor-bruto] (> valor-bruto 100)))
;;as demais formas usadas no exemplo anterior com lambda/função anonima também podem ser utilizadas.




