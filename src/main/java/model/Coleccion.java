package model;

public class Coleccion {
    private Integer idColeccion;
    private String nombre;
    private String duenho;
    private Integer idEstado;

    public Coleccion(Integer idColeccion, String nombre, String duenho, Integer idEstado) {
        this.idColeccion = idColeccion;
        this.nombre = nombre;
        this.duenho = duenho;
        this.idEstado = idEstado;
    }

    public Integer getIdColeccion() {
        return idColeccion;
    }

    public void setIdColeccion(Integer idColeccion) {
        this.idColeccion = idColeccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuenho() {
        return duenho;
    }

    public void setDuenho(String duenho) {
        this.duenho = duenho;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
}
