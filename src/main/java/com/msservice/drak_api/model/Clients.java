package com.msservice.drak_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Clients {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id ;
    private String nom ;
    private String prenom ;
    private String adresseEmail ;
    private String telephone ;


}
