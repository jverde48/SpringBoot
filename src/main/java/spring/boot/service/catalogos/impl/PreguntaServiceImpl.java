package spring.boot.service.catalogos.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.boot.entity.test.Pregunta;
import spring.boot.repository.test.PreguntaRepository;
import spring.boot.service.PreguntaService;

/**
 * Created by Green4 on 04/11/2016.
 */
@Service
public class PreguntaServiceImpl implements PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Override
    @Transactional
    public Pregunta crearPregunta(Pregunta pregunta) {
        return preguntaRepository.save(pregunta);
    }
}
