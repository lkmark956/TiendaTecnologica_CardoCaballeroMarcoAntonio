
package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Usuario {
    private int id_usuario;
    private String nombre;
    private String email;
    private Direccion direccion;
    private ArrayList<Compra> historialCompras;

    public Usuario() {}

    public Usuario(int id_usuario, String nombre, String email, Direccion direccion) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Compra> getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(ArrayList<Compra> historialCompras) {
        this.historialCompras = historialCompras;
    }
}
