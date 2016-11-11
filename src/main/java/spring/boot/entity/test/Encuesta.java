package spring.boot.entity.test;

import spring.boot.entity.security.Usuario;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

/**
 * Created by Green4 on 11/11/2016.
 */

@Entity
@Table(name = "ENCUESTA")
public class Encuesta {

    @Id
    @Column(name = "ID_ENCUESTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEncuesta;

    @Column(name = "PUNTUACION")
    private BigDecimal puntuacion;

    @OneToOne(mappedBy = "encuesta")
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,
            CascadeType.REFRESH, CascadeType.REMOVE}, mappedBy = "encuesta")
    private Set<Pregunta> preguntas;

    public Long getIdEncuesta() {
        return idEncuesta;
    }

    public void setIdEncuesta(Long idEncuesta) {
        this.idEncuesta = idEncuesta;
    }

    public BigDecimal getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(BigDecimal puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Set<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }
}
