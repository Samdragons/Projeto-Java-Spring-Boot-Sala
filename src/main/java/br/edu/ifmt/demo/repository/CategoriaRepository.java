package br.edu.ifmt.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifmt.demo.entities.Categoria;

public interface CategoriaRepository extends JpaRepository <Categoria, Long>{

}
