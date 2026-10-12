# 6. Traducir

Sea la siguiente base de datos:

    traduccion(eins, uno).
    traduccion(zwei, dos).
    traduccion(drei, tres).
    traduccion(vier, cuatro).
    traduccion(fuenf, cinco).
    traduccion(sechs, seis).
    traduccion(sieben, siete).
    traduccion(acht, ocho).
    traduccion(neun, nueve).

Escribir el predicado `traduccionLista(A, E)` que produzca la traducción de una lista de números entre alemán y español. 

Por ejemplo:

    ?- traduccionLista([eins, neun, zwei], X).
    X = [uno, nueve, dos].
    ?- traduccionLista(X, [uno, siete, seis, dos]).
    X = [eins, sieben, sechs, zwei].