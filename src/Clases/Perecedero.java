package Clases;

import Interfaces.Enviable;

import java.util.Scanner;

abstract public class Perecedero extends Producto implements Enviable {
    private String fechaCad;

    public Perecedero(int codigo,String nombre,double precio, double peso, int cantidad,  String fechaCad) {
        super(codigo, nombre, precio, peso, cantidad);
        this.fechaCad = fechaCad;
    }

    public Perecedero(Scanner in) {
        super(in);
        System.out.println("Introduce una fecha de caducidad:");
        while(true){
            try{
                fechaCad = in.nextLine();
                break;
            }catch (Exception e){
                System.out.println("La fecha ha sido mal introducida");
            }
        }
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.print(" Fecha de caducidad: " + fechaCad);
    }

    @Override
    public void imprimirEnvio() {
        super.imprimirEnvio();
        System.out.println("Tarifa de envio: " + tarifaEnvio() + " \nPrecio total: " + getPrecio());
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
        return super.volcar() + fechaCad;
    }
}
