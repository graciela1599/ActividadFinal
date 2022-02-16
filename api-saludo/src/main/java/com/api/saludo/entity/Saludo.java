package com.api.saludo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.api.saludo.request.CreateSaludoRequest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "saludo")
public class Saludo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "saludo")
	private String saludo;
	
	@Column(name = "tipo", unique = true)
	private String tipo;
	
	public Saludo(CreateSaludoRequest createSaludoRequest) {
		this.saludo = createSaludoRequest.getSaludo();
		this.tipo = createSaludoRequest.getTipo();
	}

}
