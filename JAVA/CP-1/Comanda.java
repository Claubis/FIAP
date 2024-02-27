package projeto;

import java.util.Scanner;
import java.util.ArrayList;

//Classe Comanda para eu poder inserir cada item aqui nesta lista.
class Comanda {
	private Produtos produto;
	private int quantidade;
	private ArrayList<Comanda> itens;

 public Comanda(Produtos produto, int quantidade) {
     this.produto = produto;
     this.quantidade = quantidade;
     this.itens = new ArrayList<>();
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
 
 }