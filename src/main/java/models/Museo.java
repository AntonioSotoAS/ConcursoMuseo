package models;

public class Museo {

    private Integer id;
    private String codMuseo;
    private String nombre;
    private String calle;
    private String codPostal;
    private Integer estado;

    public Museo() {
    }

    public Museo(String codMuseo, String nombre, String calle, String codPostal, Integer estado) {
        this.codMuseo = codMuseo;
        this.nombre = nombre;
        this.calle = calle;
        this.codPostal = codPostal;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
