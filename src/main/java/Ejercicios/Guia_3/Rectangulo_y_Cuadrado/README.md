Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.
```java
public class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int calcularArea() {
        return ancho * alto;
    }
}

public class Cuadrado extends Rectangulo {
    public Cuadrado(int lado) {
        super(lado, lado);
    }

    @Override
    public void setAncho(int ancho) {
        super.setAncho(ancho);
        super.setAlto(ancho);
    }

    @Override
    public void setAlto(int alto) {
        super.setAncho(alto);
        super.setAlto(alto);
    }
}
```

# Respuesta
Se viola el principio LSP (Liskov Substitution Principle) ya que Cuadrado al heredar de Rectangulo, ya no se comporta como un Rectangulo,
y una funcion que reciba un Rectangulo, a la cual se le envio un Cuadrado y se llamo a uno de los metodos, por ejemplo setAncho, se esta
modificando el Alto tambien cuando no era lo que se esperaba