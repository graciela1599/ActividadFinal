package com.api.empresa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@Table(name = "personas")

public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	@Column(columnDefinition = "BIGINT", name="edad")
	@Type(Integer.class)
	private Integer edad;
	
	private String direccion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empresa_id")
	
	private Empresa empresa;
	
	


}
