package model;

public class Centro {

    private Integer idCentro;
    private Museo museo;
    private String direccion;
    private String codCentro;
    private Integer idEstado;

    public Centro(Integer idCentro, Museo museo, String direccion, String codCentro, Integer idEstado) {
        this.idCentro = idCentro;
        this.museo = museo;
        this.direccion = direccion;
        this.codCentro = codCentro;
        this.idEstado = idEstado;
    }

    public Centro() {

    }

    public Integer getIdCentro() {
        return idCentro;
    }

    public void setIdCentro(Integer idCentro) {
        this.idCentro = idCentro;
    }

    public Museo getMuseo() {
        return museo;
    }

    public void setMuseo(Museo museo) {
        this.museo = museo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCodCentro() {
        return codCentro;
    }

    public void setCodCentro(String codCentro) {
        this.codCentro = codCentro;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
}
