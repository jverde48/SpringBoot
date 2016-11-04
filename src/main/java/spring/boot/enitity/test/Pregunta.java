package spring.boot.enitity.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import java.util.Set;

/**
 * Created by Green4 on 04/11/2016.
 */
@Entity
@Table(name = "PREGUNTA")
public class Pregunta {

    @Id
    @Column(name = "ID_PREGUNTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPregunta;

    @OneToMany
    @JoinTable(
            name="PREGUNTA_RESPUESTA",
            joinColumns={ @JoinColumn(name="ID_PREGUNTA", referencedColumnName="ID_PREGUNTA") },
            inverseJoinColumns={ @JoinColumn(name="ID_RESPUESTA", referencedColumnName="ID_RESPUESTA")})
    private Set<Respuesta> respuestas;

    public Long getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Long idPregunta) {
        this.idPregunta = idPregunta;
    }

    public Set<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(Set<Respuesta> respuestas) {
        this.respuestas = respuestas;
    }
}
