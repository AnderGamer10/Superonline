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
        System.out.println("[[Cargando productos...]]");
//        Producto p1 = new Lacteo(  1,  "Yogur-Danone",  1.50,  1,  20 ,"21/11/2022" ,"310");
//        Producto p6 = new Bebida(  6,  "Whisky",  25,  5,  7 ,"25/11/2050","43");
//        Producto p7 = new FrutaHortaliza(  7,  "Manzana",  1,  0.4,  300,"25/10/2022","Argentina");
//        Producto p12 = new Herramienta(  12,  "Taladro",  68.00,  15,  40);
//
//        addNuevoProducto(p1);
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            archivo = new File("C:\\Users\\2dam3.HZ114485\\IdeaProjects\\SuperOnline\\src\\Info\\productos.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            String linea;
            while((linea=br.readLine())!=null){
                System.out.println(linea);
                String[] textoSeparado = linea.split(" ");
                switch (linea.substring(linea.lastIndexOf(" ")+1)){
                    case "Lacteo":
                        addNuevoProducto(new Lacteo( Integer.parseInt(textoSeparado[0]),  textoSeparado[1],  Double.parseDouble(textoSeparado[2]),  Double.parseDouble(textoSeparado[4]),  Integer.parseInt(textoSeparado[3]) ,textoSeparado[5] ,textoSeparado[6]));
                        break;
                    case "FrutaHortaliza":
                        addNuevoProducto(new FrutaHortaliza( Integer.parseInt(textoSeparado[0]),  textoSeparado[1],  Double.parseDouble(textoSeparado[2]),  Double.parseDouble(textoSeparado[4]),  Integer.parseInt(textoSeparado[3]) ,textoSeparado[5] ,textoSeparado[6]));
                        break;
                    case "Bebida":
                        addNuevoProducto(new Bebida( Integer.parseInt(textoSeparado[0]),  textoSeparado[1],  Double.parseDouble(textoSeparado[2]),  Double.parseDouble(textoSeparado[4]),  Integer.parseInt(textoSeparado[3]) ,textoSeparado[5] ,textoSeparado[6]));
                        break;
                    case "Herramienta":
                        addNuevoProducto(new Herramienta( Integer.parseInt(textoSeparado[0]),  textoSeparado[1],  Double.parseDouble(textoSeparado[2]),  Double.parseDouble(textoSeparado[4]),  Integer.parseInt(textoSeparado[3])));
                        break;
                    case "Otros":
                        addNuevoProducto(new Otros( Integer.parseInt(textoSeparado[0]),  textoSeparado[1],  Double.parseDouble(textoSeparado[2]),  Double.parseDouble(textoSeparado[4]),  Integer.parseInt(textoSeparado[3]) , textoSeparado[5]));
                        break;
                }
            }
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
//               System.out.println("Id: " + producto.getCodigo() + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio() + " Peso: " + producto.getPeso() + " Stock: " + producto.getCantidad() );
                producto.imprimir();
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

