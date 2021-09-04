;;def define os símbolos a nível global, todas as funções tem acesso a esse símbolo.
;;let define o símbolo a nível de namespace, ele está disponível somente dentro do escopo da função onde foi declarado.
;;quando usamos let, precisamos definir seu valor e a função subsequente que irá usar o mesmo

(defn valor-descontado 
    [valor-bruto]    
    (let [desconto 0.10]
        (* valor-bruto (- 1 desconto))))

;;como o let recebe um array, podemos passar a declração de diversos símbolos.
(defn valor-descontado 
    [valor-bruto]    
    (let [
    taxa-de-desconto (/ 10 100)
    desconto (* valor-bruto taxa-de-desconto)]
        (- valor-bruto desconto)))

;;é possível descobrir o tipo de dados utilizando o exemplo abaixo.
(class 90.0)

;;N BigInt
;;M BigDecimal

;;o if não é considerado uma função e sim uma forma especial. formas especiais formam a base da linguagem.
;;dentro de um if a segunda função representa o "else".
;;uma função que efetua algo somente caso a condicional seja atendida (sem else) irá retorna nil caso a condicional não seja atendida.
(if (> 50 100)
    (println "maior")
    (println "menor ou igual")
)
