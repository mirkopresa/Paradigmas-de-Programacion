package Ejercicios.Guia_3.Cuenta_Bancaria;

public class CajeroAutomatico {
    private CuentaBancaria cuenta;

    public void retirarDinero(int cantidad) {
        boolean exito = cuenta.retirar(cantidad);
        if (exito) {
            System.out.println("Saldo retirado correctamente");
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
}