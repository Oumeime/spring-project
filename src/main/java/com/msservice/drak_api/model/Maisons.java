package com.msservice.drak_api.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Maisons {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id ;
	private String name;
	private String address;
	private String imageUrl;
	private String price;
	private String description;
	@ManyToOne
	private Clients clients ;
}
