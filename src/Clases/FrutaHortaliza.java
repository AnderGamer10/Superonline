package Clases;

import java.util.Scanner;

public class FrutaHortaliza extends Perecedero{
    private String origen;
    private double VALOR_IVA = 0.16;

    public FrutaHortaliza(double precio, double peso, int codigo, int cantidad, String nombre, String fechaCad, String origen) {
        super(precio, peso, codigo, cantidad, nombre, fechaCad);
        this.origen = origen;
    }

    public FrutaHortaliza(Scanner in) {
        super(in);
        while(true){
            try{
                origen = String.valueOf(in.nextInt());
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
    public void imprimirEnvio() {
        super.imprimirEnvio();
    }

    @Override
    public boolean envioFragil() {
        return super.envioFragil();
    }
}
