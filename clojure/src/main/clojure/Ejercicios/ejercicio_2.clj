; Definir la función capicua? que reciba un número entero no negativo de hasta 5 dígitos y devuelva true si el número es capicúa; si no, false.

(defn capicua? [numero]
  (loop [restante numero invertido 0]
    (if (zero? restante)
      (= numero invertido)
      (recur (quot restante 10) (+ (* invertido 10) (rem restante 10))))))