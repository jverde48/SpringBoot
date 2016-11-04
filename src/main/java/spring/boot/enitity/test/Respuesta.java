package spring.boot.enitity.test;

import spring.boot.enitity.generic.Archivo;

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
    @Column(name = "ID_ARCHIVO")
    private Archivo archivo;

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
