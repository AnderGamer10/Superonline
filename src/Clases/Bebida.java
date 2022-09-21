package Clases;

import java.util.Scanner;

public class Bebida extends Perecedero{
    private String graduacion;
    private double VALOR_IVA = 0.16;

    public Bebida(double precio, double peso, int codigo, int cantidad, String nombre, String fechaCad, String graduacion) {
        super(precio, peso, codigo, cantidad, nombre, fechaCad);
        this.graduacion = graduacion;
    }

    public Bebida(Scanner in) {
        super(in);
        while(true){
            try{
                graduacion = String.valueOf(in.nextInt());
                break;
            }catch (Exception e){
                System.out.println("El codigo introducido es incorrecto");
            }
        }
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
