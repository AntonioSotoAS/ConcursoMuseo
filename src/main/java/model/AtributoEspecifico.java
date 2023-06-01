package model;

public class AtributoEspecifico {
    private Integer idAtributoEspecifico;
    private Activo activo;
    private String nombreActributo;
    private String valorAtributo;

    public AtributoEspecifico(Integer idAtributoEspecifico, Activo activo, String nombreActributo, String valorAtributo) {
        this.idAtributoEspecifico = idAtributoEspecifico;
        this.activo = activo;
        this.nombreActributo = nombreActributo;
        this.valorAtributo = valorAtributo;
    }

    public Integer getIdAtributoEspecifico() {
        return idAtributoEspecifico;
    }

    public void setIdAtributoEspecifico(Integer idAtributoEspecifico) {
        this.idAtributoEspecifico = idAtributoEspecifico;
    }

    public Activo getActivo() {
        return activo;
    }

    public void setActivo(Activo activo) {
        this.activo = activo;
    }

    public String getNombreActributo() {
        return nombreActributo;
    }

    public void setNombreActributo(String nombreActributo) {
        this.nombreActributo = nombreActributo;
    }

    public String getValorAtributo() {
        return valorAtributo;
    }

    public void setValorAtributo(String valorAtributo) {
        this.valorAtributo = valorAtributo;
    }
}
