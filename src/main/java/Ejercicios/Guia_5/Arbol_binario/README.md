# 5. Árbol binario

Sea la siguiente representación de un árbol binario:

* Una hoja se representa con `hoja(Valor).` Por ejemplo: `hoja(3), hoja(7).`
* Dados dos árboles `B1` y `B2` se pueden combinar con `arbol(B1, B2).`

Definir el predicado `espejo/2` que produzca la imagen espejada de un árbol binario. 

Por ejemplo:
    
    ?- espejo(arbol(arbol(hoja(1), hoja(2)), hoja(4)), T).
    T = arbol(hoja(4), arbol(hoja(2), hoja(1))).
