;;Interpretador do Clojure deve ser chamado utilizando o comando clj (vai ser compilado para Java).

;;As funções devem ser chamadas dentro de parênteses, sendo o primeiro "argumento" sempre a função que será executada.
;;Exemplos 
(println "Hello World")
(+ 23 5)

;;Definimos símbolos utilizando a seguinte sintaxe:
(def total-de-produtos 15)

;;Podemos atribuir resultados de funções a símbolos da seguinte maneira:
(def total-de-produtos (+ total-de-produtos 3))

;;IFN => interface de funções do Clojure.

;;Clojure possui um conceito muito forte de imutabilidade. Ao adicionarmos um elemento a um array, o simbolo que aponta para esse array não é modificado.

;;Exemplo:
(def estoque ["Cadeira","Mesa"])
(conj estoque "Camiseta")
["Cadeira" "Mesa" "Camiseta"]

(println estoque)
[Cadeira Mesa]

;;Para redefinir os itens de um array, precisamos indicar de maneira clara que queremos redefinir o simbolo.
(def estoque (conj estoque "Camiseta"))

