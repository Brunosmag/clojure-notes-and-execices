;;a função get recebe um array e qual elemento queremos obter do mesmo.
;;se tentarmos acessar uma posição sem valor, irá retornar nil
(def precos (30 700 1000))
(println (get precos 2))

;;caso não queiramos um retorno de nil quando a posição não existir, podemos definir um valor padrão.
(println (get precos 25 0))

;;também podemos tentar acessar diretamente o vetor, mas nesse caso uma tentativa de acesso a uma posição vazia irá retornar uma exception.
(println (precos 25))

;;podemos atualizar o array utilizando a função update, lembrando que o array irá continuar imutavel. Se quisermos substituit definitivamente os dados do mesmo, precisar redefinir o simbolo.
(println (update precos 0 inc))

;;map aplica uma função para todos os elementos de uma coleção
(println "map" (map valor-descontado precos))

;;também podemos aplicar filtragem de uma coleção com o filter
;;range cria uma sequência de numeros
(println (filter even? (range 10)))

;;podemos combinar/reduzir elementos de um array com a função reduce
(println (reduce + precos))

