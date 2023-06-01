package model;

public class ActivoColeccion {
    private Activo activo;
    private Coleccion coleccion;

    public ActivoColeccion(Activo activo, Coleccion coleccion) {
        this.activo = activo;
        this.coleccion = coleccion;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public Coleccion getColeccion() {
        return coleccion;
    }

    public void setColeccion(Coleccion coleccion) {
        this.coleccion = coleccion;
    }
}
