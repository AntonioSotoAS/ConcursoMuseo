package model;

public class TipoActivo {
    private Integer idTipoActivo;
    private String nombre;

    public TipoActivo(Integer idTipoActivo, String nombre) {
        this.idTipoActivo = idTipoActivo;
        this.nombre = nombre;
    }

    public Integer getIdTipoActivo() {
        return idTipoActivo;
    }

    public void setIdTipoActivo(Integer idTipoActivo) {
        this.idTipoActivo = idTipoActivo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
