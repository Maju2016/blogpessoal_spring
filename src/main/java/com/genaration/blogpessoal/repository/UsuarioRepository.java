package com.genaration.blogpessoal.repository;

import java.util.Optional;
 
import org.springframework.data.jpa.repository.JpaRepository;
 
import com.genaration.blogpessoal.model.Usuario;
 
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
 
	Optional<Usuario> findByUsuario(String usuario);
 
}