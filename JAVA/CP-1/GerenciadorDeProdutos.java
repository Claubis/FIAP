package projeto;

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
 * Métodos que terei aqui:
 * cadastrarProduto: Para registrar no nosso banco um produto e seu valor
 * consultarProduto: Para avaliar o produto de forma individual, sendo a consulta por nome ou ID
 * consultarListaProdutos: Saber quais são os produtos na lista, vai mostrar 100% dos casos cadastrados.
 * alterarProduto: alterar dados do produto de forma individual
 * removerProduto: Remover um produto da lista que foi cadastrado de forma indevida
 * consultarProdutoComanda: Consultar os produtos na comanda.
 */


import java.util.Scanner;

public class GerenciadorDeProdutos {
	
	private ArrayList<Produtos> produtosCadastrados;
	
	Menu menu = new Menu();

    public GerenciadorDeProdutos() {
        produtosCadastrados = new ArrayList<>();
    }

    // Método para cadastrar um produto
    public void cadastrarProduto(Produtos produto) {
    	
    	Scanner input = new Scanner(System.in);
    	
        while (true) {
            System.out.println("Digite o nome do produto (ou 0 para sair):\n");
            String nome = input.nextLine();
            
            if (nome.equals("0")) {
                // Se o usuário digitou "0", definimos o número como 0
            	System.out.println("Você definiu em sair do processo de cadastro! \n");
            	System.out.println("------------------------------------------------ \n");
                int numero = 0;
                break; 
            } else {
                // Se não for "0", convertemos a entrada para um número inteiro
                String numero = nome;
            }
            
            System.out.println("Digite o preço do produto:\n");
            double preco = input.nextDouble();
            input.nextLine();

            Produtos produtoNovo = new Produtos(nome, preco);
            produtosCadastrados.add(produtoNovo);
            System.out.println("Produto cadastrado com sucesso. \n");
            System.out.println("------------------------------------------------ \n");
    }
        }

    public Produtos consultarProduto() {
        Scanner scanner = new Scanner(System.in);
        
        // Primeiro verificar se possui produtos na lista.
        if (produtosCadastrados.isEmpty()) {
            System.out.println("Não há produtos cadastrados. \n");
            System.out.println("------------------------------------------------ \n");
            return null;
        }
        
        // Se houver produtos, ai ele deixa pesquisar.
        System.out.println("O que deseja pesquisar?\n");
        System.out.println("1. Nome do produto");
        System.out.println("2. Id do produto");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite o nome do produto:\n");
                String nomePesquisa = scanner.nextLine();
                boolean encontradoPorNome = false;
                
                for (Produtos produto : produtosCadastrados) {
                    if (produto.getNome().equalsIgnoreCase(nomePesquisa)) {
                        System.out.println("Produto encontrado: \n");
                        System.out.println(produto);
                        System.out.println("\n");
                        encontradoPorNome = true;
                        System.out.println("------------------------------------------------ \n");
                    }
                }
                
                if (!encontradoPorNome) {
                    System.out.println("Produto não encontrado. \n");
                }
                break;
            case 2:
                System.out.println("Digite o Id do produto:");
                int idPesquisa = scanner.nextInt();
                scanner.nextLine(); 
                
                for (Produtos produto : produtosCadastrados) {
                    if (produto.getId() == idPesquisa) {
                        System.out.println("Produto encontrado:");
                        System.out.println(produto);
                        System.out.println("------------------------------------------------ \n");
                        return produto;
                    }
                }
                System.out.println("Produto não encontrado. \n");
                System.out.println("------------------------------------------------ \n");
                break;
            default: 
                System.out.println("Opção inválida. \n");
                System.out.println("------------------------------------------------ \n");
                break;
        }
        System.out.println("------------------------------------------------ \n");
        return null;
    }

    
    public void consultarListaProdutos() {
    	System.out.println("Lista de produtos: \n");
    	
    	// Preciso passar nos itens da lista e imprimir.
    	if (produtosCadastrados.isEmpty()) {
            System.out.println("Não há itens na lista. \n");
            System.out.println("------------------------------------------------ \n");
            
        } else {
            for (Produtos produto : produtosCadastrados) {
                System.out.println("ID: " + produto.getId());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Preço: " + produto.getPreco());
                System.out.println("------------------------------------------------ \n");
            }
        }
    }

    
    public void alterarProduto(int id) {
    	
        Scanner scanner = new Scanner(System.in);
        Produtos produto = consultarProduto();
        if (produto != null) {
            System.out.println("Produto encontrado: " + produto.getNome() + "\n");
            System.out.println("O que deseja alterar?");
            System.out.println("1. Nome do produto");
            System.out.println("2. Preço do produto");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o novo nome do produto:");
                    String novoNome = scanner.nextLine();
                    produto.setNome(novoNome);
                    System.out.println("Nome do produto alterado com sucesso.\n");
                    System.out.println("------------------------------------------------ \n");
                    break;
                case 2:
                    System.out.println("Digite o novo preço do produto:");
                    double novoPreco = scanner.nextDouble();
                    produto.setPreco(novoPreco);
                    System.out.println("Preço do produto alterado com sucesso. \n");
                    System.out.println("------------------------------------------------ \n");
                    break;
                default:
                    System.out.println("Opção inválida. \n");
                    System.out.println("------------------------------------------------ \n");
            }
        } else {
            System.out.println("Produto não encontrado.\n");
            System.out.println("------------------------------------------------ \n");
        }
    }
    
    public void removerProduto() {
        Scanner scanner = new Scanner(System.in);
        
        // Verifica se há produtos cadastrados
        if (produtosCadastrados.isEmpty()) {
            System.out.println("Não há produtos cadastrados para remover.\n");
            System.out.println("------------------------------------------------ \n");
            return;
        }

        System.out.println("Digite o ID do produto que deseja remover:");
        int idParaRemover = scanner.nextInt();

        boolean produtoRemovido = false;
        for (int i = 0; i < produtosCadastrados.size(); i++) {
            Produtos produto = produtosCadastrados.get(i);
            if (produto.getId() == idParaRemover) {
                produtosCadastrados.remove(i);
                System.out.println("Produto\nId: " + produto.getId() + "\nnome: " + produto.getNome() +  "\nFoi removido com sucesso. \n");
                produtoRemovido = true;
                break;
            }
        }
        if (!produtoRemovido) {
            System.out.println("Produto com ID " + idParaRemover + " não encontrado.\n");
            System.out.println("------------------------------------------------ \n");
        }
    }
    
    public Produtos consultarProdutoComanda(int idPesquisa) {
        // Verificar se possui produtos na lista.
        if (produtosCadastrados.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
            return null;
        }

        // Procurar o produto pelo ID
        for (Produtos produto : produtosCadastrados) {
            if (produto.getId() == idPesquisa) {
                System.out.println("Produto encontrado:");
                System.out.println(produto);
                return produto;
            }
        }

        // Se não encontrou nenhum produto com o ID especificado
        System.out.println("Produto não encontrado.");
        return null;
    }

 
    }