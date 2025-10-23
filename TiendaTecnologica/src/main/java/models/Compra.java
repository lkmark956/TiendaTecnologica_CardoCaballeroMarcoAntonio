
package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Compra {
    private int id_compra;
    private String cantidad;
    private String fecha;

    public Compra() {}

    public Compra(int id_compra, String cantidad, String fecha) {
        this.id_compra = id_compra;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

