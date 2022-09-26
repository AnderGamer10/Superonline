package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
public class Inventario {

    private static ArrayList<Producto> listaProductos;
    private static Inventario instance;
    private Inventario(){
        listaProductos = new ArrayList<Producto>();
    }
    public static Inventario getInstance(){
        if (instance == null){
            instance = new Inventario();
        }
        return instance;
    }
    public static void cargarProductos(){
        getInstance();
        System.out.println("[[Cargando productos...]]");
//        Producto p1 = new Lacteo(  1,  "Yogur-Danone",  1.50,  1,  20 ,"21/11/2022" ,"310");
//        Producto p2 = new Lacteo(  2,  "Leche Entera",  1,  2,  29 ,"30/09/2022" ,"161");
//        Producto p3 = new Lacteo(  3,  "Yogur-Griego",  2,  1.6,  56,"20/09/2022" ,"236");
//        Producto p4 = new Bebida(  4,  "Aquarius",  3.6,  2,  25 ,"29/09/2022","0");
//        Producto p5 = new Bebida(  5,  "Vodka",  13.00,  4,  17 ,"21/09/2030","40");
//        Producto p6 = new Bebida(  6,  "Whisky",  25,  5,  7 ,"25/11/2050","43");
//        Producto p7 = new FrutaHortaliza(  7,  "Manzana",  1,  0.4,  300,"25/10/2022","Argentina");
//        Producto p8 = new FrutaHortaliza(  8,  "Platano",  3.50,  5,  160,"08/01/2023","España");
//        Producto p9 = new FrutaHortaliza(  9,  "Acelgas",  2.50,  2,  25,"21/09/2022","La Rioja");
//        Producto p10 = new Herramienta(  10,  "Martillo",  12.50,  35,  36);
//        Producto p11 = new Herramienta(  11,  "Destornillador",  10.50,  45,  15);
//        Producto p12 = new Herramienta(  12,  "Taladro",  68.00,  15,  40);
//
//        addNuevoProducto(p1);
//        addNuevoProducto(p2);
//        addNuevoProducto(p3);
//        addNuevoProducto(p4);
//        addNuevoProducto(p5);
//        addNuevoProducto(p6);
//        addNuevoProducto(p7);
//        addNuevoProducto(p8);
//        addNuevoProducto(p9);
//        addNuevoProducto(p10);
//        addNuevoProducto(p11);
//        addNuevoProducto(p12);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("C:\\Users\\2dam3.HZ114485\\IdeaProjects\\SuperOnline\\src\\Info\\productos.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            String linea;
            while((linea=br.readLine())!=null)
                System.out.println(linea);
        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        System.out.println("[[Productos cargados en inventario!]]");
    }
    public static void guardarProductos(){

    }
    public static void addNuevoProducto(Producto tipo){
        listaProductos.add(tipo);
    }
    public static void mostrarProductos(){
        listaProductos.forEach(producto -> {
            if(producto != null){
                System.out.println("Id: " + producto.getCodigo() + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio() + " Peso: " + producto.getPeso() + " Stock: " + producto.getCantidad());
            }
        });
    }
    public static Producto getProducto(int id){
        return listaProductos.get(id-1);
    }
    public static void actualizarCantidad(int codigo, int cant){
        listaProductos.get(codigo).setCantidad(cant);
    }
    public static int tamaño(){
        return listaProductos.size();
    }
    public static void mostarProductosEnviables(){

    }
    public static void eliminarProducto(int id){
        listaProductos.remove(id);
    }

}

