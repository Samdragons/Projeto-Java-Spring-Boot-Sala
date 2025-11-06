package br.edu.ifmt.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifmt.demo.entities.Contas;

public interface ContaRepository extends JpaRepository <Contas, Long> {

}
