package edu.segundasemana.list.operacoesbasicas;

public class Tarefa {
	private String descricao;

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String toString() {
		//return "Tarefa{" + 
		//		"descricao='" + descricao + '\'' + 
		//		'}';
		
		return descricao;
	}
}
