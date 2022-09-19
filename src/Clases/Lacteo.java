package Clases;

import java.util.Scanner;

public class Lacteo extends Perecedero {
    private String lote;
    private double VALOR_IVA = 0.04;

    public Lacteo(double precio, double peso, int codigo, int cantidad, String nombre, String lote) {
        super(precio, peso, codigo, cantidad, nombre);
        this.lote = lote;
    }

    public Lacteo(Scanner in) {
        super(in);
    }

    @Override
    public String volcar() {
        return super.volcar();
    }

    @Override
    public boolean envioFragil() {
        return super.envioFragil();
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }
}
