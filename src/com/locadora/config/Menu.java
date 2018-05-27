package com.locadora.config;

import java.io.PrintStream;
//import java.security.SecureRandom;
//import java.util.ArrayList;
import java.util.Scanner;

import com.locadora.filmes.CadastraFilme;
import com.locadora.filmes.Filme;
import com.locadora.filmes.FilmeCopias;
import com.locadora.socio.Socio;
import com.locadora.socio.SocioCadastro;

public class Menu implements MenuInterface{

	private int opcao;
	private String msg;

	CadastraFilme cadastroFilmes = new CadastraFilme();
	Socio cadastroSocios = new Socio();
	FilmeCopias cadastroCopiasFilme = new FilmeCopias();

	public void initializeMenu() {
		// TODO fazer um funcao de inicialização do menu 
		Scanner op = new Scanner(System.in);
		do {
			this.showMenu();
			this.opcao = op.nextInt();

			System.out.println(this.opcao);
			switch (this.opcao) {
			case 0:
				showMenuByMenssage();
				op.close();
				break;
			case 1:
				menuCadastrarFilmes();
				break;
			case 2:
				menuCopiasFilmes();
				break;
			case 3:
				menuCadastroSocio();
				break;
			case 4:
				menuShowRelatorios();
				break;
			case 5:
				menuPopularCadastro();
				break;
			case 6:
				menuShowFilmesAlugados();
				break;
				
			case 7:
				menuShowFilmesDevolucao();
				break;
			default:
				System.out.println("Entre com um numero valido.");
				break;
			}

		} while (this.opcao != 0 || this.opcao != 0);

	}

	@Override
	public void showMenu() {
		System.out.println("=========Locadora Filmes da Vovô=========");
		System.out.println("================== MENU =================");
		System.out.println("-----------------------------------------");
		System.out.println("              00 - Sair:                 ");
		System.out.println("         01 - Cadastrar Filmes:          ");
		System.out.println("      02 - Fazer Copias de Filmes:       ");
		System.out.println("         03 - Cadastrar Socios:          ");
		System.out.println("             04 - Relatorios:            ");
		System.out.println("        05 - Popular o cadastro:         ");
		System.out.println("            06 - Alugar Filme:           ");
		System.out.println("           07 - Devolver Filme:          ");
		System.out.println("-----------------------------------------");
		System.out.println("------Digite uma das opções acima:-------");
	}

	@Override
	public void showMenuByMenssage() {
		this.msg = "Obrigado por usar nosso sistemas.";
		System.out.printf("%s", this.msg);
	}


	public void menuCadastrarFilmes() {

		Scanner dadosCadastroFilmeId = new Scanner(System.in);
		System.out.println("Informe o id do filme");
		int id = dadosCadastroFilmeId.nextInt();
		
		Scanner dadosCadastroFilmeTitulo = new Scanner(System.in);
		System.out.println("Informe o titulo do filme");
		String titulo = dadosCadastroFilmeTitulo.nextLine();


		Scanner dadosCadastroFilmeDuracao = new Scanner(System.in);
		System.out.println("Digite o tempo de duração: (em minutos)");
		int duracao = dadosCadastroFilmeDuracao.nextInt();


		Scanner dadosCadastroFilmeAno = new Scanner(System.in);
		System.out.println("Seu ano de lançamento:");
		int ano = dadosCadastroFilmeAno.nextInt();


		Scanner dadosCadastroFilmeFormato = new Scanner(System.in);
		System.out.println("Formato do filme: (VHS, DVD, BLUE-RAY)");
		String formato = dadosCadastroFilmeFormato.nextLine();


		Scanner dadosCadastroFilmeAtor = new Scanner(System.in);
		System.out.println("Ator principal: ");
		String ator = dadosCadastroFilmeAtor.nextLine();


		Scanner dadosCadastroFilmeAtriz = new Scanner(System.in);
		System.out.println("Atriz principal: ");
		String atriz = dadosCadastroFilmeAtriz.nextLine();

		Filme filme = new Filme(id, titulo, duracao, ano, formato, ator, atriz);
		FilmeCopias filmeCopia = new FilmeCopias(titulo);
		
		CadastraFilme cadastraFilme = new CadastraFilme(filme);
//		CadastraFilme cadastroCopiasFilme = new CadastraFilme(filmeCopia);
		cadastraFilme.cadastroDeFilme(filme);
		cadastraFilme.cadastroDeCopias(filmeCopia);
		
		System.out.println("Filme cadastrado com sucesso.");

	}
	
	public void menuShowRelatorios() { 
		System.out.println("Relatorios de filmes, socios.");
		System.out.println("===========================================");
		System.out.println("==============Filmes Originais=============");
		cadastroFilmes.showCadastro();
		System.out.println("===========================================");
		System.out.println();
		
		System.out.println("===========================================");
		System.out.println("============Filmes para Alugar=============");
		cadastroFilmes.showCadastroCopias();
		System.out.println("===========================================");
		System.out.println();
		
		System.out.println("===========================================");
		System.out.println("==============Filmes Alugado===============");
		cadastroFilmes.checkCopiaFilmeAlugados();
		System.out.println("===========================================");
		System.out.println();
		
		System.out.println("===========================================");
		System.out.println("===================Socios==================");
		cadastroFilmes.showCadastroSocios();
		System.out.println("===========================================");
	}


	public void menuCopiasFilmes() {
		System.out.println("Digite o nome do Filme a ser copiado.");
		Scanner dadosCopiaNomeFilme = new Scanner(System.in);
		String filmecopia = dadosCopiaNomeFilme.nextLine();
		cadastroFilmes.copiaFilme(filmecopia);
		
	}

	public void menuCadastroSocio()	{
		System.out.println("Cadastro de socios.");
		
		Scanner dadosCadastroSocioId = new Scanner(System.in);
		System.out.println("Informe o id: ");
		int id = dadosCadastroSocioId.nextInt();
		//TODO pegar o id automaticamente
		
		Scanner dadosCadastroSocioNome = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		String nome = dadosCadastroSocioNome.nextLine();

		Scanner dadosCadastroSocioEndereco = new Scanner(System.in);
		System.out.println("Informe o Endereço: ");
		String endereco = dadosCadastroSocioEndereco.nextLine();

		Scanner dadosCadastroSocioTelefone = new Scanner(System.in);
		System.out.println("Informe o Telefone: ");
		int telefone = dadosCadastroSocioTelefone.nextInt();

		Scanner dadosCadastroSocioRg = new Scanner(System.in);
		System.out.println("Informe o Rg: ");
		String rg = dadosCadastroSocioRg.nextLine();

		Scanner dadosCadastroSocioCpf = new Scanner(System.in);
		System.out.println("Informe o CPF: ");
		String cpf = dadosCadastroSocioCpf.nextLine();

		Scanner dadosCadastroSocioDate = new Scanner(System.in);
		System.out.println("Informe a data de cadastro: ");
		String date = dadosCadastroSocioDate.nextLine();

		Socio socio = new Socio(id, nome, endereco, telefone, rg, cpf, date);
		//		CadastraFilme cadastraFilme = new CadastraFilme(socio);
//		SocioCadastro cadastraSocio = new SocioCadastro();
		cadastroFilmes.cadastroDeSocio(socio);
		System.out.println("SOcios cadastrado com sucesso.");

	}
	
	public void menuShowFilmesAlugados() {
		System.out.println("Digite o nome do Filme a ser alugado.");
		Scanner dadosNomeFilme = new Scanner(System.in);
		String filmeAlugar = dadosNomeFilme.nextLine();
		System.out.println("Digite o nome do Socio cadastrado.");
		Scanner dadosNomeSocio = new Scanner(System.in);
		String socioAlugar = dadosNomeFilme.nextLine();
		String response = cadastroFilmes.alugarFilme(socioAlugar, filmeAlugar );
		System.out.println(response);
		
	}
	
	public void menuShowFilmesDevolucao() {
		System.out.println("Digite o nome do Filme a ser devolvido.");
		Scanner dadosNomeFilmeDevolvido = new Scanner(System.in);
		String filmeDevolvido = dadosNomeFilmeDevolvido.nextLine();
		String response = cadastroFilmes.devolucao(filmeDevolvido);
		System.out.println(response);
	}

	public void menuPopularCadastro() {
		Filme filme2 = new Filme(1, "Poeira em Alto Mar", 110, 2010, "VHS", "Tiririca", "Rocicleia");
		FilmeCopias filme2c = new FilmeCopias("Poeira em Alto Mar");
		cadastroFilmes.cadastroDeFilme(filme2);
		cadastroFilmes.cadastroDeCopias(filme2c);
		
		Filme filme3 = new Filme(2, "As tranças do Rei Careca", 200, 2012, "VHS", "Kid", "Fochilda");
		FilmeCopias filme3c = new FilmeCopias("As tranças do Rei Careca");
		cadastroFilmes.cadastroDeFilme(filme3);
		cadastroFilmes.cadastroDeCopias(filme3c);
		
		Filme filme4 = new Filme(3, "Os 7 anões", 150, 2012, "DVD", "Frota", "Rita Cadilack");
		FilmeCopias filme4c = new FilmeCopias("Os 7 anões");
		cadastroFilmes.cadastroDeFilme(filme4);
		cadastroFilmes.cadastroDeCopias(filme4c);
		
		Filme filme5 = new Filme(4, "Anaconda", 180, 2017, "Blue-ray", "Siverino", "Maria Machado");
		FilmeCopias filme5c = new FilmeCopias("Anaconda");
		cadastroFilmes.cadastroDeFilme(filme5);
		cadastroFilmes.cadastroDeCopias(filme5c);

		Socio socios2 = new Socio(1, "Joãozinho", "Vila do perdidos", 34121232, "1111111111", "12313312", "20/02/1983");
		cadastroFilmes.cadastroDeSocio(socios2);
		Socio socios3 = new Socio(2, "Ferrugem", "José Walter", 544454554, "22222222222", "321321321", "12/07/1989");
		cadastroFilmes.cadastroDeSocio(socios3);
		Socio socios4 = new Socio(3, "WallDisney", "Conj. Maracanaú", 87787772, "333333333", "453666342", "09/11/2010");
		cadastroFilmes.cadastroDeSocio(socios4);

	}

}
