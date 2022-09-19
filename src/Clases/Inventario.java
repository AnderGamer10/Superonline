package Clases;

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

    }
    public static void guardarProductos(){

    }
    public static void addNuevoProducto(Producto tipo){
        listaProductos.add(tipo);
    }
    public static void mostrarProductos(){

    }
    public static Producto getProducto(int id){
        return listaProductos.get(id);
    }
    public static void actualizarCantidad(int codigo, double cant){

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

