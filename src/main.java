import Clases.Producto;

import java.util.Scanner;

public class main {
    public static void main(String[] args){

        System.out.println("=========================================================");
        System.out.println("=          SISTEMA DE GESTION DE SUPER-ON-LINE          =");
        System.out.println("=========================================================\n");
        System.out.println("=========================================================");
        System.out.println("=          MENU PRINCIPAL - GESTION DE INVENTARIO       =");
        System.out.println("=========================================================");
        System.out.println("           tecla:1 - Cargar productos\n" +
                "           tecla:2 - Mostar inventario\n" +
                "           tecla:3 - Actualizar existencias\n" +
                "           tecla:4 - Añadir nuevo producto\n" +
                "           tecla:5 - Mostrar productos enviables\n" +
                "           tecla:6 - Guardar inventario\n" +
                "           tecla:0 - Terminar");
        System.out.println("=========================================================");
        System.out.println("Opcion: ");
        leerOpcion(6);


//        if (opcion != "0"){
//            String continuar;
//            switch (opcion){
//                case "1":
//                    System.out.println("    [[Cargando productos...]]");
////                    Cargar los productos
//                    System.out.println("    [[...Productos cargados en inventario]]\n");
//                    System.out.println("(pulsa 0 para continuar)");
//                    continuar = sc.nextLine();
//                    if (continuar == "0"){
//                        System.out.println("Bien");
//                    }
//                    break;
//                case "2":
//                    System.out.println("**** Lista completa de productos catalogados---------------");
////                    Mostar el inventario
//                    System.out.println("(pulsa 0 para continuar)");
//                    continuar = sc.nextLine();
//                    if (continuar == "0"){
//                        System.out.println("Bien");
//                    }
//                    break;
//                case "3":
//                    System.out.println("**** Lista completa de productos catalogados---------------");
////                    Mostar el inventario
//                    System.out.println("0 - Finalizar actualizacion del inventario");
//                    System.out.println("Elige el numero del producto a actualizar, tecla:x (/ - 0");
//                    System.out.println("Opcion: ");
//                    break;
//            }
//        }


    }

    private void MostrarMenuInventario(){

    }
    private int mostrarMenuActualizarInventario(){

        return 0;
    }
    private void mostrarMenuAddNuevoProducto(){

    }
    private static int leerOpcion(int max){
        Scanner sc = new Scanner(System.in);
//        String opcion = sc.nextLine();
        while (true){
            try{
                int opcion = sc.nextInt();
                break;
            }catch (Exception e){
                System.out.println("El codigo introducido es incorrecto");
            }
        }
//        return max;
    }
    private Producto nuevoProducto(){

        return null;
    }
    private void pause(){

    }

}
