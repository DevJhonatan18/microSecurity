package com.example.demo_seguridad.service;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo_seguridad.dao.UsuarioDao;
import com.example.demo_seguridad.models.entity.Role;
import com.example.demo_seguridad.models.entity.Usuario;

// import brave.Tracer;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.slf4j.*;


@Service
public class UsuarioService implements UserDetailsService {
	
	private Logger log = LoggerFactory.getLogger(UsuarioService.class);
	
	@Autowired
	private UsuarioDao usuarioDao;
	
	//@Autowired
	//private Tracer tracer;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		
		Usuario u = usuarioDao.findByUsername(username);
		
		 if (u == null) {
			 
			// tracer.currentSpan().tag("error_mesage","Error Login");
			 
	            throw new UsernameNotFoundException("Error login");
	        }
		
		 // Set<GrantedAuthority> grantedAuthorities = new HashSet()<>();
		 List<GrantedAuthority> authorities = u.getRoles().stream().map(ro-> new SimpleGrantedAuthority(ro.getNombre())  ).peek(autho -> log.info("Role"+
		   autho.getAuthority() )).collect(Collectors.toList());
		 
		 log.info("Usuario autenticado" + username);
		 
		 
		 
	    /*    for (Role role : u.getRoles()){
	            grantedAuthorities.add(new SimpleGrantedAuthority(role.getNombre()));
	        }*/
	    
		 User ud = new User(u.getUsername(), u.getPassword(),u.getEnabled(),true,true,true, authorities);
		 
		return ud;
	}

}
