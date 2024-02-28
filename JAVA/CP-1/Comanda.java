package projeto;

import java.util.Scanner;
import java.util.ArrayList;

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
 * Somente para criar as propriedades da comanda.
 */

//Classe Comanda para eu poder inserir cada item aqui nesta lista.
class Comanda {
	private Produtos produto;
	private int quantidade;
	private ArrayList<Comanda> itens;
	private double valorFinalComanda;

 public Comanda(Produtos produto, int quantidade) {
     this.produto = produto;
     this.quantidade = quantidade;
     this.itens = new ArrayList<>();
     this.valorFinalComanda = 0.0;
 }

 public Produtos getProduto() {
     return produto;
 }

 public int getQuantidade() {
     return quantidade;
 }

 public double calcularTotalItem() {
     return produto.getPreco() * quantidade;
 }

 public void adicionarItem(Produtos produto, int quantidade) {
     Comanda item = new Comanda(produto, quantidade);
     this.itens.add(item);
}
 
 public ArrayList<Comanda> getItens() {
     return itens;
 }
 

 public double getValorFinalComanda() {
     return valorFinalComanda;
 }

 public void setValorFinalComanda(double valorFinalComanda) {
     this.valorFinalComanda = valorFinalComanda;
 }
 
 }