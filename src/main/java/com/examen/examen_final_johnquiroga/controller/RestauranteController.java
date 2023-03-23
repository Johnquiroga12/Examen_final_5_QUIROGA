package com.examen.examen_final_johnquiroga.controller;


import com.examen.examen_final_johnquiroga.model.Restaurante;
import com.examen.examen_final_johnquiroga.service.RestauranteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/restaurante")
public class RestauranteController {
    @Autowired
    RestauranteService Service;

    @GetMapping("/listar")
    public ResponseEntity<List<Restaurante>> listar() {
        return new ResponseEntity<>(Service.findByAll(),
                HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<Restaurante> crear(
            @RequestBody Restaurante p) {
        return new ResponseEntity<>(Service.save(p),
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Restaurante> actualizar(@PathVariable Long id, @RequestBody Restaurante p) {
        Restaurante personaENcontrada = Service.findById(id);
        if (personaENcontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                personaENcontrada.setNombre(p.getNombre());
                personaENcontrada.setDireccion(p.getDireccion());
                return new ResponseEntity<>(Service.save(p), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Restaurante> eliminar(@PathVariable Long id) {
        Service.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

