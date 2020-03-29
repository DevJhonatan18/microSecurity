package com.example.demo_seguridad.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo_seguridad.models.entity.Usuario;


public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long>  {

	public Usuario findByUsername( @Param("nombre") String username );
	
	
}
