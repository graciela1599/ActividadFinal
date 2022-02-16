package com.api.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.empresa.entity.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	Empresa findByNombreAndDireccion(String nombre, String direccion);
	
	Empresa findByNombre(String nombre);
	
	

}
