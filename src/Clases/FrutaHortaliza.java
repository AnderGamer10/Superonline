package Clases;

import java.util.Scanner;

public class FrutaHortaliza extends Perecedero{
    private String origen;
    private double VALOR_IVA = 0.16;

    public FrutaHortaliza(int codigo,String nombre, double precio, double peso, int cantidad, String fechaCad, String origen) {
        super(codigo, nombre, precio, peso, cantidad,  fechaCad);
        this.origen = origen;
    }

    public FrutaHortaliza(Scanner in) {
        super(in);
        while(true){
            try{
                origen = String.valueOf(in.nextInt());
                break;
            }catch (Exception e){
                System.out.println("Origen mal introducido");
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
        System.out.print("Origen: " + origen);
    }
    @Override
    public boolean envioFragil() {
        return super.envioFragil();
    }

    public void calcularPrecioEnvio(){

    }
}
