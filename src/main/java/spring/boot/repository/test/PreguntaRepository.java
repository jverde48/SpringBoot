package spring.boot.repository.test;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.enitity.test.Pregunta;

/**
 * Created by Green4 on 04/11/2016.
 */
public interface PreguntaRepository extends JpaRepository<Pregunta, Long> {
}
