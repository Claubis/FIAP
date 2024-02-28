package projeto;

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

public class Menu {
    
    public static void menu() {
        System.out.println("Seja bem vindo, defina uma opção do menu! \n");
        System.out.println("Selecione uma opção desejada: \n");
        System.out.println("1 - Cadastrar novo produto");
        System.out.println("2 - Consultar Lista de produtos");
        System.out.println("3 - Consultar produto único");
        System.out.println("4 - Alterar produto");
        System.out.println("5 - Excluir produto");
        System.out.println("6 - Abrir comanda");
        System.out.println("7 - Consultar comanda");
        System.out.println("8 - adicionar produto na comanda");
        System.out.println("9 - Limpar comanda");
        System.out.println("10 - Excluir comanda");
        System.out.println("11 - Realizar pagamento");
        System.out.println("12 - Sair");
    }
}
