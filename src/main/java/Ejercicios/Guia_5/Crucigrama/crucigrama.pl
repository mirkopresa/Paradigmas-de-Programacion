palabra(astante, a, s, t, a, n, t, e).
palabra(astoria, a, s, t, o, r, i ,a).
palabra(baratto, b, a, r, a, t, t, o).
palabra(cobalto, c, o, b, a, l, t, o).
palabra(pistola, p, i, s, t, o, l, a).
palabra(statale, s, t, a, t, a, l, e).
coinciden(H1, H2, H3, V1, V2, V3) :-
    palabra(H1, _, C11, _, C12, _, C13, _),
    palabra(H2, _, C21, _, C22, _, C23, _),
    palabra(H3, _, C31, _, C32, _, C33, _),
    palabra(V1, _, C11, _, C21, _, C31, _),
    palabra(V2, _, C12, _, C22, _, C32, _),
    palabra(V3, _, C13, _, C23, _, C33, _),
    H1 \= H2, H1 \= H3, H2 \= H3,
    V1 \= V2, V1 \= V3, V2 \= V3,
    H1 \= V1, H1 \= V2, H1 \= V3,
    H2 \= V1, H2 \= V2, H2 \= V3,
    H3 \= V1, H3 \= V2, H3 \= V3.




