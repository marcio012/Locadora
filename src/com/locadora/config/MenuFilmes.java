package com.locadora.config;

import java.util.Scanner;

public class MenuFilmes implements MenuInterface{

	private int menuFilmes;
	
	@Override
	public void initializeMenu() {
		// TODO fazer um funcao de inicialização do menu 
		Scanner opmf = new Scanner(System.in);
//		this.opcaoMf = 100;
		do {
			this.showMenu();
			this.menuFilmes = opmf.nextInt();
			opmf.close();
			switch (this.menuFilmes) {
			case 0:
				this.showMenuByMenssage();
				opmf.close();
				break;
			case 1:
				System.out.println("Caso 1");
				break;
			default:
				System.out.println("Entre com um numero valido.");
				break;
			}

		} while (this.menuFilmes != 0 || this.menuFilmes != 00);
		
	}

	@Override
	public void showMenu() {
		System.out.println("=========Locadora Filmes da Vovô=========");
		System.out.println("============== MENU FILMES ==============");
		System.out.println("-----------------------------------------");
		System.out.println("               00 - Sair:                ");
		System.out.println("       01 - Cadastro de Originais:       ");
		System.out.println("            02 - Fazer Copias:           ");
		System.out.println("             03 - Relatorios:            ");
		System.out.println("-----------------------------------------");
		System.out.println("------Digite uma das opções acima:-------");

	}

	@Override
	public void showMenuByMenssage() {
		// TODO Auto-generated method stub

	}


}
