package model;

import java.time.LocalDateTime;

public class Empleado {
    private Integer idEmpleado;
    private Cargo cargo;
    private String dni;
    private String apellido;
    private String nombre;
    private LocalDateTime fechaCambio;

    public Empleado(Integer idEmpleado, Cargo cargo, String dni, String apellido, String nombre, LocalDateTime fechaCambio) {
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaCambio = fechaCambio;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFechaCambio() {
        return fechaCambio;
    }

    public void setFechaCambio(LocalDateTime fechaCambio) {
        this.fechaCambio = fechaCambio;
    }
}
