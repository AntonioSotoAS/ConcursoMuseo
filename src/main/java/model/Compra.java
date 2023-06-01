package model;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;

import java.time.LocalDateTime;

public class Compra {
    private Integer idCompra;
    private Activo activo;
    private Usuario usuario;
    private LocalDateTime fecha;
    private String autor;
    private Integer idEstado;

    public Compra(Integer idCompra, Activo activo, Usuario usuario, LocalDateTime fecha, String autor, Integer idEstado) {
        this.idCompra = idCompra;
        this.activo = activo;
        this.usuario = usuario;
        this.fecha = fecha;
        this.autor = autor;
        this.idEstado = idEstado;
    }

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
}
