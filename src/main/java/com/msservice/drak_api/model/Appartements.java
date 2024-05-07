package com.msservice.drak_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Appartements {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id ;
    private String espace ;
    private String position ;
    private String localisation  ;
    private String meublage ;
    @ManyToOne
    private Clients clients ;
}
