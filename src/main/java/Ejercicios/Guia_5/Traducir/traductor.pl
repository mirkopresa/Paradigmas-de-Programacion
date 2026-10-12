traduccion(eins, uno).
traduccion(zwei, dos).
traduccion(drei, tres).
traduccion(vier, cuatro).
traduccion(fuenf, cinco).
traduccion(sechs, seis).
traduccion(sieben, siete).
traduccion(acht, ocho).
traduccion(neun, nueve).
traduccionLista([X], [Y]) :- traduccion(X, Y).
traduccionLista([H|T], [R|RS]) :- traduccionLista(T, RS), traduccion(H, R).