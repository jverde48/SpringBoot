package spring.boot.controller.catalogos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.entity.test.Pregunta;
import spring.boot.service.catalogos.impl.PreguntaServiceImpl;

/**
 * Created by Green4 on 04/11/2016.
 */
@RestController(value = "/api/pregunta")
public class PreguntaController {

    @Autowired
    private PreguntaServiceImpl preguntaServiceImp;

    @PostMapping(name = "/crear", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Pregunta> crearPregunta(@RequestBody Pregunta pregunta) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
