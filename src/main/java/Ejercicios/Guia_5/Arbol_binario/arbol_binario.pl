hoja(X).
arbol(B1, B2).
espejo(hoja(X), T) :- hoja(X) = T.
espejo(arbol(B1, B2), arbol(E1, E2)) :- espejo(B1, E2), espejo(B2, E1).