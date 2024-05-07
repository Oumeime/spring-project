package com.msservice.drak_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Paiyements {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id ;
    private LocalDate date;
    private  long prix;
    private int quantité;
}
