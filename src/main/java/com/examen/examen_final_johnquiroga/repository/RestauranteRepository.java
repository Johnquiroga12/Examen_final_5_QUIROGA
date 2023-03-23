package com.examen.examen_final_johnquiroga.repository;

import com.examen.examen_final_johnquiroga.model.Restaurante;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestauranteRepository extends MongoRepository<Restaurante,Long> {

}
