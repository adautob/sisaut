package com.csv.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {

	@GetMapping("/sisaut/login")
	public String login() {
		return "index";
	}

	@PostMapping("/index")
	public String index(
			@RequestParam("usuario") String usuario,
			@RequestParam("senha") String senha,
			HttpSession session,
			ModelMap modelMap) {

		if (usuario.equals("admin") && senha.equals("admin")) {
			session.setAttribute("usuario", usuario);
			return ("sucesso");
		} else {
			modelMap.put("erro", "Usuário ou senha inválidos!");
			return ("index");
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.removeAttribute("usuario");
		return "index";
	}


}
