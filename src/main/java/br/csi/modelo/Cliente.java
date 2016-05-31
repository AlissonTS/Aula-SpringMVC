package br.csi.modelo;

public class Cliente {
	
		private long codigo;
		private String nome;
		private String ruaNroComp;
		private String bairro;
		private String cidade;
		
		public long getCodigo() {
			return codigo;
		}
		public void setCodigo(long codigo) {
			this.codigo = codigo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getRuaNroComp() {
			return ruaNroComp;
		}
		public void setRuaNroComp(String ruaNroComp) {
			this.ruaNroComp = ruaNroComp;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
	
}
