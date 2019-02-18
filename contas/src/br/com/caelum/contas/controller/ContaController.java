package br.com.caelum.contas.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.contas.dao.ContaDAO;
import br.com.caelum.contas.modelo.Conta;

@Controller
public class ContaController {

	@RequestMapping("/form")
	public String formulario() throws SQLException {
		return "formulario";
	}
	
	@RequestMapping("/adicionaConta")
	public String adiciona(Conta conta) throws SQLException {
		
		System.out.println("Conta adicionada é: " + conta.getDescricao());
		
		ContaDAO dao = new ContaDAO();
		
		dao.adiciona(conta);
		
		return "conta-adicionada";
	}
}
