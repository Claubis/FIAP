package projeto;

import java.util.Scanner;

public class Produtos {
	
	// Atributos
	private static int contar = 1; // Para criação do novo produto de forma automática
	private int id; // ID do meu produto
	private String nome; // Nome do produto conforme o ID
	private Double preco; // Preco unitário de cada produto.
	
	// Construtor
	public Produtos(String nome, Double preco) {
		this.id = contar;
		this.nome = nome;
		this.preco = preco;
		Produtos.contar += 1; // Cada vez que eu criar um novo produto, vai ser gerado um novo ID na sequêcia do último.
	}
	
	public static int getContar() {
		return contar;
	}
	public static void setContar(int contar) {
		Produtos.contar = contar;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
	    return "ID: " + id + ", \nNome: " + nome + ", \nPreço: " + preco + "\n";
	}
		
}
