package Clases;

import Interfaces.Enviable;

import java.util.Scanner;

abstract public class Perecedero extends Producto implements Enviable {
    private String fechaCad;

    public Perecedero(double precio, double peso, int codigo, int cantidad, String nombre) {
        super(precio, peso, codigo, cantidad, nombre);
    }

    public Perecedero(Scanner in) {
        super(in);
    }

    @Override
    public void imprimir() {
        super.imprimir();
    }

    @Override
    public void imprimirEnvio() {
        super.imprimirEnvio();
    }

    @Override
    public boolean envioFragil() {
        return Enviable.super.envioFragil();
    }

    @Override
    public double tarifaEnvio() {
        return Enviable.super.tarifaEnvio();
    }
}
