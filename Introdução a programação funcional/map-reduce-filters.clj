;;podemos desestruturar um array (Destruct)
(defn imprime-15
  [[chave valor]]
  (println chave "e" valor)
  15)

;;o threading last possibilita passarmos o resultado da função anterior como ultimo parametro para a proxima.
;;,,,,está simbolizando onde o threading está sendo passado
(defn total-do-pedido
  [pedido]
  (->> pedido
    (map preco-dos-produtos ,,,,)
    (reduce + ,,,,)))
