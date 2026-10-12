trenDirecto(saarbruecken, dudweiler).
trenDirecto(forbach, saarbruecken).
trenDirecto(freyming, forbach).
trenDirecto(stAvold, freyming).
trenDirecto(fahlquemont, stAvold).
trenDirecto(metz, fahlquemont).
trenDirecto(nancy, metz).
viajar(X, Y) :- trenDirecto(X, Y)
viajar(X, Y) :- trenDirecto(X, A), viajar(A, Y).