; Definir la función nth-fibo que reciba un número entero no negativo y devuelva el correspondiente término de la sucesión de Fibonacci.

(defn nth-fibo [n]
  (loop [anterior 0 actual 1 contador 0]
    (if (= contador n)
      anterior
      (recur actual (+ actual anterior) (inc contador)))))