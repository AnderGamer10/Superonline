package Clases;

import java.util.Scanner;

public class Otros extends NoPerecedero{
    private String categoria;
    private double VALOR_IVA = 0.16;

    public Otros(double precio, double peso, int codigo, int cantidad, String nombre, String categoria) {
        super(precio, peso, codigo, cantidad, nombre);
        this.categoria = categoria;
    }

    public Otros(Scanner in) {
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
}
