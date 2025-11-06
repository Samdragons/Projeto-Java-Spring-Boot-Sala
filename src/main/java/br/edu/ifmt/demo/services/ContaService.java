package br.edu.ifmt.demo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import br.edu.ifmt.demo.entities.Contas;
import br.edu.ifmt.demo.repository.ContaRepository;

public class ContaService {
	
	@Autowired
	private ContaRepository contarepo;
	
	public List<Contas> listarTodos(){
		return contarepo.findAll();
	}
}
