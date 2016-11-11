package spring.boot.entity.test;

import spring.boot.entity.generic.Archivo;

import javax.persistence.*;

/**
 * Created by Green4 on 04/11/2016.
 */
@Entity
@Table(name = "RESPUESTA")
public class Respuesta {

    @Id
    @Column(name = "ID_RESPUESTA")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRespuesta;

    @Column(name = "IS_CORRECTA")
    private Boolean isCorrecta;

    @OneToOne
    @JoinColumn(name="ID_ARCHIVO", nullable = true)
    private Archivo archivo;

    @ManyToOne
    @JoinTable(name="PREGUNTA_RESPUESTA",
            joinColumns =  @JoinColumn(name = "ID_RESPUESTA", referencedColumnName = "ID_RESPUESTA"),
            inverseJoinColumns = @JoinColumn(name = "ID_PREGUNTA", referencedColumnName = "ID_PREGUNTA"))
    private Pregunta pregunta;

    public Long getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Long idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public Boolean getCorrecta() {
        return isCorrecta;
    }

    public void setCorrecta(Boolean correcta) {
        isCorrecta = correcta;
    }

    public Archivo getArchivo() {
        return archivo;
    }

    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }
}
