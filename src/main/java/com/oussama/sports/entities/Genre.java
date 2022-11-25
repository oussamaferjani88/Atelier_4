package com.oussama.sports.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Genre {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private Long idG;
	private String nomG;
	private String descG;
	
	@OneToMany (mappedBy = "genre")
	@JsonIgnore
	private List<Sport> sports;
	

	public Long getIdG() {
		return idG;
	}
	public void setIdG(Long idG) {
		this.idG = idG;
	}
	public String getNomG() {
		return nomG;
	}
	public void setNomG(String nomG) {
		this.nomG = nomG;
	}
	public String getDescG() {
		return descG;
	}
	public void setDescG(String descG) {
		this.descG = descG;
	}
	public List<Sport> getSports() {
		return sports;
	}
	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}
	
	

}
