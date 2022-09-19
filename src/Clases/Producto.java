package Clases;

import java.util.Scanner;

abstract public class Producto {
    private double iva, precio, peso;
    private int codigo, cantidad;
    private String nombre;

    public Producto(){

    }
    public Producto(double precio, double peso, int codigo, int cantidad, String nombre) {
        this.precio = precio;
        this.peso = peso;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }
    public Producto(Scanner in){
        while(true){
            try{
                codigo = in.nextInt();
                break;
            }catch (Exception e){
                System.out.println("El codigo introducido es incorrecto");
            }
        }
    }

    public double calcularPrecioIVA(){
        return 0;
    }
    public void imprimir(){

    }
    public void imprimirEnvio(){

    }
    public String volcar(){

        return null;
    }


    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
