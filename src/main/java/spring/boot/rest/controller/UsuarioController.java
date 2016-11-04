package spring.boot.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by green4 on 04/11/2016.
 */

@RestController
public class UsuarioController {

    @RequestMapping
    public ResponseEntity<?> i() {
        return ResponseEntity.ok("");
    }
}
