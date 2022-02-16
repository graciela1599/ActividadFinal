package com.api.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.empresa.entity.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	
	
	Empresa findByNombreAndDireccion(@Param("nombre") String nombre,@Param("direccion") String direccion);
	
	Empresa findByNombre(String nombre);
	
	

}
