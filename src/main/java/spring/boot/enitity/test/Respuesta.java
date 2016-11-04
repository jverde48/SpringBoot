package spring.boot.enitity.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

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
}
