package Ejercicios.Guia_3.Auto;

public class Auto {
    private boolean enMovimiento;

    public Auto() {
        this.enMovimiento = false;
    }

    public void mover() {
        enMovimiento = true;
    }

    public void frenar() {
        enMovimiento = false;
    }

    public boolean getMovimiento() {
        return enMovimiento;
    }
}
