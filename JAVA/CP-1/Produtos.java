package projeto;

import java.util.Scanner;

/*
 * Meu processo vai iniciar com o cadastrado dos produtos, onde vamos conseguir consultar
 * cada produto cadastrado, lista o item individual ou em grupo
 *  Alterar alguma informação de produto
 *  Excluir um produto quando não for mais vender na loja
 *  Depois vamos abrir a comanda, sendo limitado até 10 nesse momento
 *  Adicionar um produto na comanda pelo ID ou nome
 *  Consultar a comanda para saber se possui item ou não
 *  Limpar a comomanda quando tiver suja
 *  Excluir uma comanda quando for aberta de forma indevida
 *  Realizar o pagamento que será ver o produto, quantidade e valor final.
 * 
 */

/*
 * 
 * Classe criada para gerar ID, nome e preço dos produtos.
 * Não terei métodos dentro dessa classe.
 * Será criado os métodos na classe Gerenciador de produtos.
 * 
 */

public class Produtos {
	
	// Atributos
	private static int contar = 1; // Para criação do novo produto de forma automática
	private int id; // ID do meu produto
	private String nome; 
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
