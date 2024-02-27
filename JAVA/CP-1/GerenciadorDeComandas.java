package projeto;

import java.util.Scanner;
import java.util.ArrayList;

public class GerenciadorDeComandas {
	private ArrayList<Produtos> produtosCadastrados;
	private ArrayList<Comanda> comandas;

    public GerenciadorDeComandas(ArrayList<Produtos> produtosCadastrados) {
        this.produtosCadastrados = produtosCadastrados;
        this.comandas = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) { // Vou deixar 10 comandar na lista para limitar meu processo.
            comandas.add(null); // Adicionar uma comanda vazia à lista, para não dar erro.
        }
    }

    public void abrirComanda() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o ID da comanda:");
        int idComanda = input.nextInt(); 
       
        
        // Verificar se a comanda já está aberta
        if (comandas.get(idComanda) != null) {
            System.out.println("A comanda " + (idComanda + 1) + " já está aberta.");
            System.out.println("------------------------------------------------ \n");
        } else {
       // Criar e adicionar a comanda à lista de comandas
            Comanda novaComanda = new Comanda(null, idComanda);
            comandas.set(idComanda, novaComanda);
            System.out.println("Comanda " + (idComanda) + " aberta com sucesso.");
            System.out.println("------------------------------------------------ \n");
        }
    }
    
    
    public void listarItensDaComanda() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o ID da comanda:");
        int idComanda = input.nextInt();
        input.nextLine();
        
        // Verificar se a comanda com o ID especificado existe
        if (idComanda < 0 || idComanda >= comandas.size() || comandas.get(idComanda) == null) {
            System.out.println("Comanda não encontrada.\n");
            return;
        }
        
        // Exibir os itens da comanda
        Comanda comanda = comandas.get(idComanda);
        System.out.println("Itens da comanda " + idComanda + ":");
        for (Comanda item : comanda.getItens()) {
            System.out.println("Produto: " + item.getProduto().getNome() + " - Quantidade: " + item.getQuantidade());
            System.out.println("------------------------------------------------ \n");
        }
       
    }
    
    
    public void adicionarProdutoNaComanda(GerenciadorDeProdutos gerenciador) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ID da comanda:");
        int idComanda = input.nextInt();
        input.nextLine();

        // Verificar se a comanda com o ID especificado existe
        if (idComanda < 0 || idComanda >= comandas.size() || comandas.get(idComanda) == null) {
            System.out.println("Comanda não encontrada.\n");
            System.out.println("------------------------------------------------ \n");
            return;
        }

        // Exibir os produtos cadastrados para que o usuário possa escolher
        gerenciador.consultarListaProdutos();

        System.out.println("Digite o ID do produto que deseja adicionar:");
        int idProduto = input.nextInt();
        input.nextLine();

        // Verificar se o produto com o ID especificado existe
        Produtos produtoEncontrado = gerenciador.consultarProdutoComanda(idProduto);
        if (produtoEncontrado == null) {
            System.out.println("Produto não encontrado.\n");
            System.out.println("------------------------------------------------ \n");
            return;
        }

        // Solicitar a quantidade do produto
        System.out.println("Digite a quantidade:");
        int quantidade = input.nextInt();
        input.nextLine();

        // Criar o item da comanda
        Comanda comanda = comandas.get(idComanda);
        comanda.adicionarItem(produtoEncontrado, quantidade);

        System.out.println("Produto adicionado à comanda.\n");
        System.out.println("------------------------------------------------ \n");
        Menu.menu();
    }
    
    public void pagarComanda() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o ID da comanda:");
        int idComanda = input.nextInt();
        input.nextLine();

        // Verificar se a comanda com o ID especificado existe
        if (idComanda < 0 || idComanda >= comandas.size() || comandas.get(idComanda) == null) {
            System.out.println("Comanda não encontrada.\n");
            System.out.println("------------------------------------------------ \n");
            return;
        }

        // Exibir os itens da comanda e calcular o valor total
        Comanda comanda = comandas.get(idComanda);
        double totalComanda = 0.0;

        System.out.println("Itens da comanda " + idComanda + ":");
        for (Comanda item : comanda.getItens()) {
            System.out.println("Produto: " + item.getProduto().getNome() + " - Quantidade: " + item.getQuantidade() +
                    " - Valor unitário: " + item.getProduto().getPreco() + " - Valor total: " + item.calcularTotalItem());
            totalComanda += item.calcularTotalItem();
        }

        System.out.println("Valor total da comanda: " + totalComanda + "\n");
     
        
        
    } 
    
    public void limparComanda(int idComandaLimpar) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Digite o ID da comanda que deseja limpar:");
    	
    	int idComandaLimpar1 = input.nextInt();
    	
        if (idComandaLimpar1 >= 0 && idComandaLimpar1 < comandas.size() && comandas.get(idComandaLimpar1) != null) {
            comandas.get(idComandaLimpar1).getItens().clear();
            System.out.println("Comanda " + idComandaLimpar1 + " limpa com sucesso.\n");
            System.out.println("------------------------------------------------ \n");
        } else {
            System.out.println("Comanda não encontrada ou não existe. \n");
            System.out.println("------------------------------------------------ \n");
        }
    }

    public void excluirComanda(int idComandaExcluir) {
    	
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Digite o ID da comanda que deseja excluir:");
    	
    	int idComandaExcluir1 = input.nextInt();
    	
        if (idComandaExcluir1 >= 0 && idComandaExcluir1 < comandas.size() && comandas.get(idComandaExcluir1) != null) {
            comandas.set(idComandaExcluir1, null);
            System.out.println("Comanda " + idComandaExcluir1 + " excluída com sucesso.\n");
            System.out.println("------------------------------------------------ \n");
        } else {
            System.out.println("Comanda não encontrada ou não existe. \n");
            System.out.println("------------------------------------------------ \n");
        }
    }





      
}
