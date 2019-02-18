package br.com.caelum.contas.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OlaMundoController {

	@RequestMapping("/olaMundoSpring")
	public String olaMundoSpring() throws SQLException {
		System.out.println("chamou olaMundoSpring");
		return "ok";
	}
}
