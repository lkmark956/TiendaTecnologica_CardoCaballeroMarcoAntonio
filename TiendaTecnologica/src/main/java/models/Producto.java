package models;

import java.util.Map;
import java.util.HashMap;

public class Producto {
    private int id_producto;
    private String nombre;
    private float precio;
    private String descripcion;
    private int inventario;
    private Map<String, Object> caracteristicas;

    public Producto(int id_producto, String nombre, float precio, String descripcion, int inventario) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.inventario = inventario;
        this.caracteristicas = new HashMap<>();
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public Map<String, Object> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(Map<String, Object> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}