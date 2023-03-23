package com.examen.examen_final_johnquiroga.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Data
@Document(collection = "prefesor")
public class Cliente {
    @Id
    private Long cliemte_id;
    private String nombre;
    private String apellido;
    private String cedula;

    private String correo;


}
