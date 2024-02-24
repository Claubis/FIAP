package projetoChallenge;

import java.util.Scanner;

public class Menu {
	public int menu() {
	Scanner input = new Scanner(System.in);
	
	System.out.println(" Menu inicial - Selecione uma opção digitando um número da lista abaixo");
	System.out.println(" 0 - Retornar ao menu principal ");
	System.out.println(" 1 - Cadastrar ");
	System.out.println(" 2 - Listar cadastro ");
	System.out.println(" 3 - Realizar o login ");
	System.out.println(" 4 - Sair");
	System.out.println(" Digite 4 a qualquer momento para sair/encerrar o programa ou 0 para retornar ao menu anterior.");

	
	int opcao = input.nextInt();
	
	return opcao;
	}

}

