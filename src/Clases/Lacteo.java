package Clases;

import java.util.Scanner;

public class Lacteo extends Perecedero {
    private String lote;
    private double VALOR_IVA = 0.04;

    public Lacteo(int codigo,String nombre, double precio, double peso, int cantidad,String fechaCad, String lote) {
        super(codigo, nombre, precio, peso, cantidad,  fechaCad);
        this.lote = lote;
    }

    public Lacteo(Scanner in) {
        super(in);
        System.out.println("Introduce un lote:");
        while(true){
            try{
                lote = String.valueOf(in.nextInt());
                break;
            }catch (Exception e){
                System.out.println("Lote mal introducido");
                in.nextLine();
            }
        }
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
        System.out.println(" Producto lácteo " + lote);
    }
}
