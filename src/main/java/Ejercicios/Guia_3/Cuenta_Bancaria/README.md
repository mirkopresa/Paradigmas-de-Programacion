Dado el siguiente código, identificar qué principios se violan y proponer un diseño alternativo.
```java
public class CuentaBancaria {
    private int saldo;

    public void depositar(int cantidad) {
        saldo += cantidad;
    }

    public void retirar(int cantidad) {
        saldo -= cantidad;
    }

    public int obtenerSaldo() {
        return saldo;
    }
}

public class CajeroAutomatico {
    private CuentaBancaria cuenta;

    public void retirarDinero(int cantidad) {
        if (cuenta.obtenerSaldo() >= cantidad) {
            cuenta.retirar(cantidad);
            System.out.println(cantidad + " retirados exitosamente.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}
```

# Respuesta
Se viola el principio TDA (Tell, Don't Ask!) ya que retirarDinero() utiliza el metodo obtenerSaldo() de CuentaBancaria para realizar una 
accion al respecto, que en este caso es retirar(), cuando el que deberia estar haciendo esto es el mismo objeto CuentaBancaria y no el CajeroAutomatico
