package com.examen.examen_final_johnquiroga.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@Document(collection = "plato")
public class Plato {

    @Id
    private Long prof_id;
    private String nombreplato;
    private String descripcion;
    private double precio;

}
