package Ejercicios.Guia_3.Cuenta_Bancaria;

public class CuentaBancaria {
    private int saldo;

    public void depositar(int cantidad) {
        saldo += cantidad;
    }

    public boolean retirar(int cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    public int obtenerSaldo() {
        return saldo;
    }
}