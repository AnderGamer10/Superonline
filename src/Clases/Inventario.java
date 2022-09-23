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
        getInstance();
        System.out.println("[[Cargando productos...]]");
        Producto p1 = new Lacteo(  1,  "Queso-Cheedar",  1.50,  14,  20 ,"21/09/2022" ,"210");
        Producto p2 = new Lacteo(  2,  "Leche-Kaiku",  0.50,  34,  29 ,"23/09/2022" ,"111");
        Producto p3 = new Lacteo(  3,  "Yogur-Danone ",  0.40,  10,  17,"20/09/2022" ,"421");
        Producto p4 = new Bebida(  4,  "CocaCola",  2.50,  40,  4 ,"21/09/2022","0");
        Producto p5 = new Bebida(  5,  "Heineken 0.0",  2.00,  40,  4 ,"21/09/2022","0");
        Producto p6 = new Bebida(  6,  "Heineken",  2.50,  40,  4 ,"21/09/2022","4.3");
        Producto p7 = new FrutaHortaliza(  7,  "Esparragos",  1.50,  33,  10,"21/09/2022","Peru");
        Producto p8 = new FrutaHortaliza(  8,  "Alcachofas",  3.50,  12,  6,"21/09/2022","Tudela");
        Producto p9 = new FrutaHortaliza(  9,  "Acelgas",  2.50,  65,  25,"21/09/2022","La Rioja");
        Producto p10 = new Herramienta(  10,  "Martillo",  12.50,  35,  36);
        Producto p11 = new Herramienta(  11,  "Destornillador",  10.50,  45,  15);
        Producto p12 = new Herramienta(  12,  "Taladro",  68.00,  15,  40);

        addNuevoProducto(p1);
        addNuevoProducto(p2);
        addNuevoProducto(p3);
        addNuevoProducto(p4);
        addNuevoProducto(p5);
        addNuevoProducto(p6);
        addNuevoProducto(p7);
        addNuevoProducto(p8);
        addNuevoProducto(p9);
        addNuevoProducto(p10);
        addNuevoProducto(p11);
        addNuevoProducto(p12);
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
                System.out.println("Codigo: " + producto.getCodigo() + " Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio() + " Peso: " + producto.getPeso() + " Stock: " + producto.getCantidad() );
            }
        });
    }
    public static Producto getProducto(int id){
        return listaProductos.get(id);
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

