package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.csi.dao.ClienteDao;
import br.csi.modelo.Cliente;

@Controller
public class ClienteController {
	
	@RequestMapping("clientes")
	public String msgTeste(){
		
		System.out.println("Chamou o Controllador :D");
		return "forward:listaClientes";
	}
	
	@RequestMapping("adicionarClientes")
	public String adiciona(Cliente cliente){
		
		boolean retorno  = new ClienteDao().adicionar(cliente);
		if(retorno){
			return "forward:listaClientes";
		}else{
			return "erro";
		}
	}
	
	@RequestMapping("remover")
	public String remover(Cliente c){
		
		boolean retorno  = new ClienteDao().remover(c);
		if(retorno){
			return "forward:listaClientes";
		}else{
			return "erro";
		}
	}
	
	@RequestMapping("listaClientes")
	public ModelAndView lista(){
		System.out.println("...chamou o listar....");
		
		ModelAndView mv  = new ModelAndView("cliente");
		mv.addObject("clientes", new ClienteDao().listaClientes());
		
		return mv;
	}
	
}
