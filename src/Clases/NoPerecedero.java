package Clases;

import java.util.Scanner;

public class NoPerecedero extends Producto{
    public NoPerecedero(double precio, double peso, int codigo, int cantidad, String nombre) {
        super(precio, peso, codigo, cantidad, nombre);
    }

    public NoPerecedero(Scanner in) {
        super(in);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}
