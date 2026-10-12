# 1. Magos

Sea la siguiente base de datos:

```prolog
mago(ron).
tieneVarita(harry).
juegaQuidditch(harry).
mago(X) :- tieneEscoba(X), tieneVarita(X).
tieneEscoba(X):- juegaQuidditch(X)
```

Cómo responde Prolog a las siguientes consultas? Dibujar en cada caso el árbol de búsqueda.

```prolog
?- mago(ron).
?- bruja(ron).
?- mago(hermione).
?- bruja(hermione).
?- mago(harry).
?- mago(Y).
?- bruja(Y).
```

* `mago(ron).` : responde `true`
* `bruja(ron).` : responde `Unknown procedure: bruja/1`
* `mago(hermione).` : responde `false`
* `bruja(hermione).` : responde `Unknown procedure: bruja/1`
* `mago(harry).` : responde `true`
* `mago(Y).` : responde `Y = ron, Y = harry`
* `bruja(Y).` : responde `Unknown procedure: bruja/1`