package Clases;

import java.util.Scanner;

public class FrutaHortaliza extends Perecedero{
    private String origen;
    private double VALOR_IVA = 0.16;

    public FrutaHortaliza(double precio, double peso, int codigo, int cantidad, String nombre, String origen) {
        super(precio, peso, codigo, cantidad, nombre);
        this.origen = origen;
    }

    public FrutaHortaliza(Scanner in) {
        super(in);
    }

    @Override
    public String volcar() {
        return super.volcar();
    }

    @Override
    public void imprimirEnvio() {
        super.imprimirEnvio();
    }

    @Override
    public boolean envioFragil() {
        return super.envioFragil();
    }
}
