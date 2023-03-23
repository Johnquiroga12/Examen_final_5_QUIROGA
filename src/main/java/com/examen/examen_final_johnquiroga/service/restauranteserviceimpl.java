package com.examen.examen_final_johnquiroga.service;

import com.examen.examen_final_johnquiroga.model.Restaurante;
import com.examen.examen_final_johnquiroga.repository.RestauranteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class restauranteserviceimpl extends GenericServiceImpl<Restaurante, Long> implements RestauranteService {

    @Autowired
    RestauranteRepository Repository;

    @Override
    public CrudRepository<Restaurante, Long> getDao() {
        return Repository;

    }
}
