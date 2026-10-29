; Definir la función qsort que recibe una secuencia y la ordena usando el algoritmo Quicksort.

(defn qsort [arreglo]
  (if (empty? arreglo)
    arreglo
    (let [pivote (first arreglo)
          menores (filter #(<= % pivote) (rest arreglo))    ; #(<= % pivote) funcion anonima
          mayores (filter #(> % pivote) (rest arreglo))]
      (concat (qsort menores) [pivote] (qsort mayores)))))