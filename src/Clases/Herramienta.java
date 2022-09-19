package Clases;

import Interfaces.Enviable;

import java.util.Scanner;

public class Herramienta extends NoPerecedero implements Enviable {
    private double VALOR_IVA = 0.4;

    public Herramienta(double precio, double peso, int codigo, int cantidad, String nombre) {
        super(precio, peso, codigo, cantidad, nombre);
    }

    public Herramienta(Scanner in) {
        super(in);
    }

    @Override
    public boolean envioFragil() {
        return Enviable.super.envioFragil();
    }

    @Override
    public double tarifaEnvio() {
        return Enviable.super.tarifaEnvio();
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
    public void imprimirEnvio() {
        super.imprimirEnvio();
    }
}
