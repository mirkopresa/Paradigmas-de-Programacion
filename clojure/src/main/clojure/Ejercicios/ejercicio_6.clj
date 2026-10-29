; Definir la función slice que reciba una cadena s y un número n y devuelva una lista con todas las subcadenas contiguas de s cuyo tamaño sea n.

(defn slice [cadena n]
  (loop [actual cadena lista []]
    (if (< (count actual) n)
      (apply list lista)
      (recur (subs actual 1) (conj lista (subs actual 0 n))))))