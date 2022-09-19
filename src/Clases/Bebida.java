package Clases;

import java.util.Scanner;

public class Bebida extends Perecedero{
    private String graduacion;
    private double VALOR_IVA = 0.16;

    public Bebida(double precio, double peso, int codigo, int cantidad, String nombre, String graduacion) {
        super(precio, peso, codigo, cantidad, nombre);
        this.graduacion = graduacion;
    }

    public Bebida(Scanner in) {
        super(in);
    }

    @Override
    public String volcar() {
        return super.volcar();
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }

    @Override
    public boolean envioFragil() {
        return super.envioFragil();
    }
}
