package spring.boot.entity.security;

import javax.persistence.*;

/**
 * Created by Green4 on 04/11/2016.
 */

@Entity
@Table(name = "ROL")
public class Rol {

    @Id
    @Column(name = "ID_ROL")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(name = "AUTHORITY")
    private String authory;

    @Column(name = "DESCRIPCION_ROL")
    private String descrpcionRol;

    @ManyToOne
    @JoinTable(name="USUARIO_ROL",
            joinColumns =  @JoinColumn(name = "ID_ROL", referencedColumnName = "ID_ROL"),
            inverseJoinColumns = @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO"))
    private Usuario usuario;

    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public String getAuthory() {
        return authory;
    }

    public void setAuthory(String authory) {
        this.authory = authory;
    }

    public String getDescrpcionRol() {
        return descrpcionRol;
    }

    public void setDescrpcionRol(String descrpcionRol) {
        this.descrpcionRol = descrpcionRol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
