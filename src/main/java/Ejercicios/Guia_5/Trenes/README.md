# 4. Trenes

Sean las siguientes cláusulas que describen algunas localidades que están conectadas con un tramo de tren:

```prolog
trenDirecto(saarbruecken, dudweiler).
trenDirecto(forbach, saarbruecken).
trenDirecto(freyming, forbach).
trenDirecto(stAvold, freyming).
trenDirecto(fahlquemont, stAvold).
trenDirecto(metz, fahlquemont).
trenDirecto(nancy, metz).
```

Escribir un predicado `viajar/2` que permita averiguar si es posible o no viajar de una localidad a otra, ya sea en uno o más tramos de tren. 
Por ejemplo, `?- viajar(nancy, saarbruecken)` debe dar verdadero.