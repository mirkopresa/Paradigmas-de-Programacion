; Definir una función que devuelva true si una frase es un pangrama (es decir, si contiene todas las letras del alfabeto); si no, false.

(defn pangrama? [frase]
  (if (< (count frase) 27)
    false
    (let [frase-minuscula (clojure.string/lower-case frase)
          alfabeto "abcdefghijklmnñopqrstuvwxyz"]
      (every? (set frase-minuscula) alfabeto))))