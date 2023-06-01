package model;

import java.time.LocalDateTime;

public class Exposicion {
    private Integer idExposicion;
    private Empleado empleo;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private Integer idEstado;

    public Exposicion(Integer idExposicion, Empleado empleo, LocalDateTime fechaInicio, LocalDateTime fechaFin, Integer idEstado) {
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

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
}
