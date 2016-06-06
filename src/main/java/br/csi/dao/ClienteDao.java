package br.csi.dao;

import java.util.ArrayList;

import br.csi.modelo.Cliente;

public class ClienteDao {
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	private Long geraCodigo(){
		
		int co = clientes.size()+1;
		String codigo = String.valueOf(co);
		Long cod = Long.parseLong(codigo);
		return cod;
	}	
	
	private void initClientes(){
		if(clientes.size()<=0){
			clientes = new ArrayList<Cliente>();
			
			Cliente c = new Cliente();
			
			c.setCodigo(geraCodigo());
			c.setNome("Paulo");
			c.setBairro("Centro");
			c.setRuaNroComp("Duque de Caxias N: 187 apto 258");
			c.setCidade("Santa Maria");
			clientes.add(c);
		}
	}
	
	public boolean adicionar (Cliente c){
		
		c.setCodigo(geraCodigo());
		System.out.println("Código: "+c.getCodigo());
		System.out.println("Nome: "+c.getNome());
		System.out.println("Rua: "+c.getRuaNroComp());
		System.out.println("Bairro: "+c.getBairro());
		System.out.println("Cidade: "+c.getCidade());
		
		clientes.add(c);
		
		return true;
	}
	
	public ArrayList<Cliente> listaClientes(){
		
		initClientes();
		
		return clientes;
	}
	
	public boolean remover(Cliente c){
		
		for (Cliente cliente : clientes){
			if(cliente.getCodigo()==c.getCodigo()){
				clientes.remove(cliente);
				
				return true;
			}
		}
		
		return false;
	}
	
}
