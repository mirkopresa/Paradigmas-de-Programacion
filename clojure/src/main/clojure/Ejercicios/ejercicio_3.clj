; Definir la función aprox-pi que reciba la cantidad de términos a considerar entre los paréntesis de la expresión
; 4 · (1 - 1/3 + 1/5 - 1/7 + ... + 1/n) y devuelva la correspondiente aproximación de π.

(defn aprox-pi [n]
  (loop [actual 0 contador 0 indice 1 signo 1.0]
    (if (= contador n)
      (* 4 actual)
      (recur (+ actual (/ (* 1 signo) indice)) (inc contador) (+ indice 2) (* signo -1)))))