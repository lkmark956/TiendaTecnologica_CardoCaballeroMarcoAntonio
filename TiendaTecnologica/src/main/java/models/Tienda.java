
package models;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Tienda {
    private String nombre;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Compra> compras;

    public Tienda() {}

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.usuarios = new ArrayList<>();
        this.compras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Compra> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Compra> compras) {
        this.compras = compras;
    }
}
