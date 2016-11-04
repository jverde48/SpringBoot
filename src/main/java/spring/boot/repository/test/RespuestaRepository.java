package spring.boot.repository.test;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.boot.enitity.test.Respuesta;

/**
 * Created by Green4 on 04/11/2016.
 */
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
}
