package edu.segundasemana.javaset.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		super();
		this.contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		for(Contato c : contatoSet) {
			if(c.getNome().startsWith(nome)) {
				contatosPorNome.add(c);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		for(Contato c : contatoSet) {
			if(c.getNome().equalsIgnoreCase(nome)) {
				c.setNumero(novoNumero);
				contatoAtualizado = c;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		
		AgendaContatos agendaContatos = new AgendaContatos();
		
		agendaContatos.exibirContatos();
		
		agendaContatos.adicionarContato("Nome 1", 12345678);
		agendaContatos.adicionarContato("Nome 1", 0);
		agendaContatos.adicionarContato("Nome 2", 73325548);
		agendaContatos.adicionarContato("Nome 3", 11111111);
		agendaContatos.adicionarContato("Nome 4", 12121212);
		
		agendaContatos.exibirContatos();
		
		agendaContatos.atualizarNumeroContato("Nome 3", 33333333);
		
		agendaContatos.exibirContatos();
		
		System.out.println(agendaContatos.pesquisarPorNome("Nome 1"));
		
	}
	
}
