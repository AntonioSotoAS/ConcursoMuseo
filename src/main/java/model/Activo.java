package model;

public class Activo {
    private Integer idActivo;
    private TipoActivo tipoActivo;
    private Sala sala;
    private double ancho;
    private double alto;
    private double peso;
    private Integer idEstado;

    public Activo(Integer idActivo, TipoActivo tipoActivo, Sala sala, double ancho, double alto, double peso, Integer idEstado) {
        this.idActivo = idActivo;
        this.tipoActivo = tipoActivo;
        this.sala = sala;
        this.ancho = ancho;
        this.alto = alto;
        this.peso = peso;
        this.idEstado = idEstado;
    }

    public Integer getIdActivo() {
        return idActivo;
    }

    public void setIdActivo(Integer idActivo) {
        this.idActivo = idActivo;
    }

    public TipoActivo getTipoActivo() {
        return tipoActivo;
    }

    public void setTipoActivo(TipoActivo tipoActivo) {
        this.tipoActivo = tipoActivo;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
}
