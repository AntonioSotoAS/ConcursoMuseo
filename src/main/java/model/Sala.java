package model;

public class Sala {
    private Integer idSala;
    private Centro centro;
    private String nombre;
    private Integer idEstado;

    public Sala(Integer idSala, Centro centro, String nombre, Integer idEstado) {
        this.idSala = idSala;
        this.centro = centro;
        this.nombre = nombre;
        this.idEstado = idEstado;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public Centro getCentro() {
        return centro;
    }

    public void setCentro(Centro centro) {
        this.centro = centro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
}
