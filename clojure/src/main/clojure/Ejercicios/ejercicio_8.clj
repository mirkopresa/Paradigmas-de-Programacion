; Definir una función que calcule la profundidad de una lista recursiva.

(defn profundidad [lista]
  (if (not (coll? lista))
    0
    (if (empty? lista)
      1
      (+ (apply max (map profundidad lista)) 1))))

(profundidad '((2 3)(3 ((7))) 5))