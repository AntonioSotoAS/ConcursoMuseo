package model;

import java.time.LocalDateTime;

public class Traslado {

    private Integer idTranslado;
    private Activo activo;
    private Usuario usuario;
    private LocalDateTime fecha;
    private LocalDateTime fechaRetorno;
    private String motivo;
    private Integer idEstado;

    public Traslado(Integer idTranslado, Activo activo, Usuario usuario, LocalDateTime fecha, LocalDateTime fechaRetorno, String motivo, Integer idEstado) {
        this.idTranslado = idTranslado;
        this.activo = activo;
        this.usuario = usuario;
        this.fecha = fecha;
        this.fechaRetorno = fechaRetorno;
        this.motivo = motivo;
        this.idEstado = idEstado;
    }

    public Integer getIdTranslado() {
        return idTranslado;
    }

    public void setIdTranslado(Integer idTranslado) {
        this.idTranslado = idTranslado;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalDateTime getFechaRetorno() {
        return fechaRetorno;
    }

    public void setFechaRetorno(LocalDateTime fechaRetorno) {
        this.fechaRetorno = fechaRetorno;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
}
