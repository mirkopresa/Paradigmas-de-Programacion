package Ejercicios.Guia_1.Fecha;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(String mes, int dia, int anio) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int i = 0;
        for (String nombre : meses) {
            if (nombre.equals(mes)) {
                this.mes = i + 1;
                break;
            }
            i++;
        }
        this.dia = dia;
        this.anio = anio;
    }

    public Fecha(int diaDelAnio, int anio) {
        int[] dias = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int i = 0;
        for (int diaMes : dias) {
            if (diaDelAnio - diaMes <= 0) {
                this.dia = diaDelAnio;
                this.mes = i + 1;
                break;
            }
            diaDelAnio -= diaMes;
            i++;
        }
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void imprimirFecha1() {
        System.out.println(mes + "/" + dia + "/" + anio);
    }

    public void imprimirFecha2() {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int i = mes - 1;
        for (String posibleMes : meses) {
            if (i - 1 < 0) {
                System.out.println(posibleMes + " " + dia + ", " + anio);
                return;
            }
            i--;
        }
    }

    public void imprimirFecha3() {
        int[] dias = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int diaTotal = 0;
        int i = 0;
        for (int diasMes : dias) {
            if (i == mes-1) {
                diaTotal = dia + diasMes;
                break;
            }
            i++;
        }
        System.out.println(diaTotal + " " + anio);
    }
}
