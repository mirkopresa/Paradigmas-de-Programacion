# 2. Oraciones
Sea la siguiente base de datos:

```prolog
palabra(determinante, el).
palabra(determinante, un).
palabra(nucleo, pez).
palabra(nucleo, 'alfajor triple').
palabra(verbo, come).
palabra(verbo, compra).

oracion(Palabra1, Palabra2, Palabra3, Palabra4, Palabra5):-
   palabra(determinante, Palabra1),
   palabra(nucleo, Palabra2),
   palabra(verbo, Palabra3),
   palabra(determinante, Palabra4),
   palabra(nucleo, Palabra5).
```

¿Qué consulta hay que hacer para averiguar todas las oraciones posibles? 
Listar los resultados que generará Prolog en el orden esperado.

Consulta: `oraciones(A, B, C, D, E).`
Resultado:
```prolog
A = D, D = el,
B = E, E = pez,
C = come ;
A = D, D = el,
B = pez,
C = come,
E = 'alfajor triple' ;
A = el,
B = E, E = pez,
C = come,
D = un ;
A = el,
B = pez,
C = come,
D = un,
E = 'alfajor triple' ;
A = D, D = el,
B = E, E = pez,
C = compra ;
A = D, D = el,
B = pez,
C = compra,
E = 'alfajor triple' ;
A = el,
B = E, E = pez,
C = compra,
D = un ;
A = el,
B = pez,
C = compra,
D = un,
E = 'alfajor triple' ;
A = D, D = el,
B = 'alfajor triple',
C = come,
E = pez ;
A = D, D = el,
B = E, E = 'alfajor triple',
C = come ;
A = el,
B = 'alfajor triple',
C = come,
D = un,
E = pez ;
A = el,
B = E, E = 'alfajor triple',
C = come,
D = un ;
A = D, D = el,
B = 'alfajor triple',
C = compra,
E = pez ;
A = D, D = el,
B = E, E = 'alfajor triple',
C = compra ;
A = el,
B = 'alfajor triple',
C = compra,
D = un,
E = pez ;
A = el,
B = E, E = 'alfajor triple',
C = compra,
D = un ;
A = un,
B = E, E = pez,
C = come,
D = el ;
A = un,
B = pez,
C = come,
D = el,
E = 'alfajor triple' ;
A = D, D = un,
B = E, E = pez,
C = come ;
A = D, D = un,
B = pez,
C = come,
E = 'alfajor triple' ;
A = un,
B = E, E = pez,
C = compra,
D = el ;
A = un,
B = pez,
C = compra,
D = el,
E = 'alfajor triple' ;
A = D, D = un,
B = E, E = pez,
C = compra ;
A = D, D = un,
B = pez,
C = compra,
E = 'alfajor triple' ;
A = un,
B = 'alfajor triple',
C = come,
D = el,
E = pez ;
A = un,
B = E, E = 'alfajor triple',
C = come,
D = el ;
A = D, D = un,
B = 'alfajor triple',
C = come,
E = pez ;
A = D, D = un,
B = E, E = 'alfajor triple',
C = come ;
A = un,
B = 'alfajor triple',
C = compra,
D = el,
E = pez ;
A = un,
B = E, E = 'alfajor triple',
C = compra,
D = el ;
A = D, D = un,
B = 'alfajor triple',
C = compra,
E = pez ;
A = D, D = un,
B = E, E = 'alfajor triple',
C = compra.
```