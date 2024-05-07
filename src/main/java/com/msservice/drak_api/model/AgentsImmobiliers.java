package com.msservice.drak_api.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AgentsImmobiliers {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id ;
    private String nom ;
    private String prenom ;
    private String telephone ;
    @OneToMany
    private List<Appartements> appartements ;
    @OneToMany
    private List<Maisons> maisons ;
    @OneToMany
    private List<Villas> villas ;



}
