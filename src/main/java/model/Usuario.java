package model;

public class Usuario {
    private Integer idUsuario;
    private Empleo empleo;
    private String username;
    private String password;

    public Usuario(Integer idUsuario, Empleo empleo, String username, String password) {
        this.idUsuario = idUsuario;
        this.empleo = empleo;
        this.username = username;
        this.password = password;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Empleo getEmpleo() {
        return empleo;
    }

    public void setEmpleo(Empleo empleo) {
        this.empleo = empleo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
