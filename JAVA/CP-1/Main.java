package projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();
    	ArrayList<Produtos> produtos = new ArrayList<>();
    	GerenciadorDeComandas gerenciadorComanda = new GerenciadorDeComandas(produtos);
    	
    	Scanner input = new Scanner(System.in);
    	
    	Menu menu = new Menu();
    	//Menu.menu();
    	
    	int opcao;
        
        while (true) {
        	Menu.menu();
       
        	 opcao = input.nextInt();
             input.nextLine();
             
            switch (opcao) {
    			case 1:
    				gerenciador.cadastrarProduto(null);
    				break;
    			case 2:
    				gerenciador.consultarListaProdutos();
    				break;
    			case 3:
    				gerenciador.consultarProduto();
    				break;
    			case 4:
    				gerenciador.alterarProduto(opcao);
    				break;
    			case 5:
    				gerenciador.removerProduto();
    				break;
    			case 6:
    				gerenciadorComanda.abrirComanda();
    				System.out.println(" Deseja adicionar um produto na comanda? 1 - Sim ou 2 - Não \n");
    				System.out.println("------------------------------------------------ \n");
    				
    				int escolhaAdicionarProduto = input.nextInt();
    				input.nextLine();
    				
    		        if (escolhaAdicionarProduto == 1) {
    		        	//gerenciadorComanda.adicionarProdutoNaComanda();
    		        } else if (escolhaAdicionarProduto == 2) {
    		            Menu.menu();
    		            System.out.println("------------------------------------------------");
    		        } else {
    		            System.out.println("Opção inválida.");
    		            Menu.menu();
    		            System.out.println("------------------------------------------------");
    		        }
    		        break;
    				
    			case 7:
    				gerenciadorComanda.listarItensDaComanda();
    				break;
    				
    			case 8:
    				gerenciadorComanda.adicionarProdutoNaComanda(gerenciador);
    				int escolhaAdicionarComanda = input.nextInt();
    				input.nextLine();
    				
    		        if (escolhaAdicionarComanda == 1) {
    		        	gerenciadorComanda.abrirComanda();
    		        } else if (escolhaAdicionarComanda == 2) {
    		            Menu.menu();
    		            System.out.println("Obrigado e até logo! \n");
    		            System.out.println("------------------------------------------------");
    		        } else {
    		            System.out.println("Opção inválida.");
    		            Menu.menu();
    		            System.out.println("------------------------------------------------");
    		        }
    		        break;
    			case 9:
    				gerenciadorComanda.limparComanda(opcao);
    				break;
    			
    			case 10:
    				gerenciadorComanda.excluirComanda(opcao);
    				break;
    		        
    			case 11:
    				gerenciadorComanda.pagarComanda();
    				break;
    			
    			case 12:
    				Caixa pagamento = new Caixa(gerenciadorComanda);
    				pagamento.pagarComanda(null);
    				break;
    			case 13:
    				System.out.println("Encerrando o programa, até logo");
    				System.exit(0);

        	}
        }
    }
}
