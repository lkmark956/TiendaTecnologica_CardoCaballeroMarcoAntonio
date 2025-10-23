package models;

import java.util.ArrayList;

public class Categoria {

    private int id_tienda;
    private String nombre;
    private ArrayList<Producto> productos;

    public Categoria(int id_tienda, String nombre, ArrayList<Producto> productos) {
        this.id_tienda = id_tienda;
        this.nombre = nombre;
        this.productos = productos;
    }

    public int getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
