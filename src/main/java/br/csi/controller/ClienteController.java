package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClienteController {
	
	@RequestMapping("clientes")
	public String msgTeste(){
		
		System.out.println("Chamou o Controllador :D");
		return "cliente";
	}
	
}
