package model;

public class Cargo {
    private Integer idCargo;
    private String nombre;

    public Cargo(Integer idCargo, String nombre) {
        this.idCargo = idCargo;
        this.nombre = nombre;
    }

    public Integer getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Integer idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
