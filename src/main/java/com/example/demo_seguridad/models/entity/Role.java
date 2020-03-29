package com.example.demo_seguridad.models.entity;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.io.Serializable;
@Entity
@Table(name="roles")
public class Role implements Serializable {
	
	
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -1046409612293642664L;
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    private String nombre;
	
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
    
    
}
