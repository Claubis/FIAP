package projeto;

import java.util.ArrayList;
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
                int numero = 0;
                break; // Sai do loop
            } else {
                // Se não for "0", convertemos a entrada para um número inteiro
                String numero = nome;
            }
            
            System.out.println("Digite o preço do produto:\n");
            double preco = input.nextDouble();
            input.nextLine(); // Limpar o buffer do scanner

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
        scanner.nextLine(); // Consumindo a quebra de linha

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
        return null; // Retornando null fora do switch
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
            scanner.nextLine(); // Limpa o buffer do scanner

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
                break; // Encerra o loop após remover o produto
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