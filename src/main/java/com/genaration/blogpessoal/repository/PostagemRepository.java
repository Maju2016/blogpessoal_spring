package com.genaration.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.genaration.blogpessoal.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	
}