package model;

import java.sql.Date;

public class Exposicion {
    private Integer idExposicion;
    private Empleado empleo;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer idEstado;

    public Exposicion() {
    }

    public Exposicion(Integer idExposicion, Empleado empleo, Date fechaInicio, Date fechaFin, Integer idEstado) {
        this.idExposicion = idExposicion;
        this.empleo = empleo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.idEstado = idEstado;
    }

    public Integer getIdExposicion() {
        return idExposicion;
    }

    public void setIdExposicion(Integer idExposicion) {
        this.idExposicion = idExposicion;
    }

    public Empleado getEmpleo() {
        return empleo;
    }

    public void setEmpleo(Empleado empleo) {
        this.empleo = empleo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }

    
}
