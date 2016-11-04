package spring.boot.enitity.test;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Green4 on 04/11/2016.
 */
@Entity
@Table(name = "PREGUNTA")
public class Pregunta {

    @Id
    private Long idPregunta;
}
