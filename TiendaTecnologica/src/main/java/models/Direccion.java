package models;

public class Direccion {
    private String calle;
    private String ciudad;
    private String pais;
    private int numero;

    public Direccion() {}

    public Direccion(String calle, String ciudad, String pais, int numero) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}