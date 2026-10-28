; Definir la función segundos que reciba los cuatro valores (días, horas, minutos y segundos) del tiempo que dura un evento
; y devuelva el valor de ese tiempo expresado solamente en segundos.

(defn segundos [d h m s]
  (+ (* d 86400) (* h 3600) (* m 60) s))

(segundos 1 4 40 4)