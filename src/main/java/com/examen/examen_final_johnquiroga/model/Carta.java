package com.examen.examen_final_johnquiroga.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Data
@Document(collection = "carta")
public class Carta  {
    @Id
    private Long carta_id;
    private String nombre;
    private String categoria;
    private int cantidad;
private Plato plato;
private List listaplato;

}
