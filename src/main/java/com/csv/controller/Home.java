package com.csv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Home {
	
	@GetMapping("login")
	String login() {
		return "login";
	}
	
	@PostMapping("logar")
	String logar(String usuario, String senha) {
		boolean logou = false;
		logou =  (usuario.equals("admin")&&senha.equals("admin"));
		
		if (logou) return "redirect:index";
		else return "login";
	}
	
	@GetMapping("index")
	String index() {
		return "index";
	}

}
