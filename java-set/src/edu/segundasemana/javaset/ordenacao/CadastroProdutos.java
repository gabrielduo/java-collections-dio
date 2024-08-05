package edu.segundasemana.javaset.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	private Set<Produto> produtoSet;

	public CadastroProdutos() {
		this.produtoSet = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		produtoSet.add(new Produto(nome, cod, preco, quantidade));		
	}
	
	public Set<Produto> exibirProdutosPorNome(){
		Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
		return produtosPorNome;
	}
	
	public Set<Produto> exibirProdutosPorPreco(){
		Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(produtoSet);
		return produtosPorPreco;
	}
	
	public static void main(String[] args) {
		CadastroProdutos cadastroProdutos = new CadastroProdutos();
		
		System.out.println(cadastroProdutos.produtoSet);
		
		cadastroProdutos.adicionarProduto(1, "Produto 1", 15, 3);
		cadastroProdutos.adicionarProduto(2, "Produto 2", 5, 4);
		cadastroProdutos.adicionarProduto(1, "Produto 3", 35, 1);
		cadastroProdutos.adicionarProduto(3, "Produto 3", 35.23, 1);
		cadastroProdutos.adicionarProduto(4, "Produto 5", 3, 2);
		cadastroProdutos.adicionarProduto(5, "Produto 4", 4, 3);
		
		System.out.println(cadastroProdutos.produtoSet);
		
		cadastroProdutos.exibirProdutosPorNome();
		
		System.out.println(cadastroProdutos.produtoSet);

		cadastroProdutos.exibirProdutosPorPreco();
		
		System.out.println(cadastroProdutos.produtoSet);



	}
}
