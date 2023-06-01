
package model;

public class Museo {
    
    private Integer idMuseo;
    private String codMuseo;
    private String nombre;
    private String calle;
    private String codPostal;
    private Integer idEstado;

    public Museo(Integer idMuseo, String codMuseo, String nombre, String calle, String codPostal, Integer idEstado) {
        this.idMuseo = idMuseo;
        this.codMuseo = codMuseo;
        this.nombre = nombre;
        this.calle = calle;
        this.codPostal = codPostal;
        this.idEstado = idEstado;
    }

    public Integer getIdMuseo() {
        return idMuseo;
    }

    public void setIdMuseo(Integer idMuseo) {
        this.idMuseo = idMuseo;
    }

    public String getCodMuseo() {
        return codMuseo;
    }

    public void setCodMuseo(String codMuseo) {
        this.codMuseo = codMuseo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
    
}
