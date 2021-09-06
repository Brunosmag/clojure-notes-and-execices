;;podemos trabalhar com hashmaps (chave / valor)
;;por padrão não existe garantia de ordem no retorno dessas chaves/valores
(def estoque {"Mochila" 10, "Camiseta" 5})

;;podemos verificar todas as chaves e valores dessa coleção
(println "Temos" (count estoque) "elementos")


;;ou verificar as chaves e valores do seguinte modo:
(println "Chaves são:" (keys estoque))
(println "Valores são:" (vals estoque))

;;o padrão é utilizar o modelo de keyword para definir as chaves
(def estoque {:mochila 10, :camiseta 5}
  
;;para associar uma nova chave/valor (lembrando que devido a imutabilidade o simbolo estoque não será modificado a não ser que explicitamente redefinido.
(assoc estoque :cadeira 3)
  
;;para desassociar
(dissoc estoque :cadeira)
  
;;a keyword também pode ser invocada como uma função, ela implementa a IFN
(println (:mochila pedido))
  
;;mapas podem ter profundidade
(def pedido {:mochila {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}})

;;podemos efetuar buscas nesse mapa complexo.
(println (:quantidade (:mochila pedido)))
  
;;threading consiste em "conectar" funções e seus resultados.
(-> pedido :mochila :quantidade)
  

