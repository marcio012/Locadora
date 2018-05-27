package com.locadora.filmes;

import java.util.ArrayList;

import com.locadora.socio.Socio;

public class CadastraFilme {

	public Filme filme;
	public FilmeCopias filmeCopia;
	public Socio socio;

	public static ArrayList<Socio> listSocios = new ArrayList<>();
	public static ArrayList<Filme> listFilmes = new ArrayList<Filme>();
	public static ArrayList<FilmeCopias> copiasFilmes = new ArrayList<FilmeCopias>();
	public static ArrayList<FilmeCopias> copiasFilmesAlugados = new ArrayList<FilmeCopias>();


	public void cadastroDeFilme(Filme filme) {
		if(listFilmes.isEmpty()){
			System.out.println("Lista vazia vou add");
			listFilmes.add(filme);
			//			String filmeCopias = filme.getTitulo();
			//			copiasFilmes.add(filmeCopia);
		} else {
			System.out.println("Lista nao vazia vou add");
			listFilmes.add(filme);
			//			String filmeCopias = filme.getTitulo();
			//			copiasFilmes.add(filmeCopia);
		}
		listFilmes.size();
	}

	public void cadastroDeCopias(FilmeCopias filme) {
		if(copiasFilmes.isEmpty()){
			System.out.println("Lista de copias vazia vou add");
			copiasFilmes.add(filme);
		} else {
			System.out.println("Lista copias nao vazia vou add");
			copiasFilmes.add(filme);
		}
		copiasFilmes.size();
	}

	public CadastraFilme() {
		super();
	}

	//construtor
	public CadastraFilme(Filme filme) {
		this.filme = filme;
	}

	public void showCadastro() {
		for (int i = 0; i < listFilmes.size(); i++) {
			System.out.println("Lista de Filmes cadastrados");
			System.out.println("===========================================");
			System.out.printf("id: %d%n"
					+ "titulo: %s%n"
					+ "duracao: %d%n"
					+ "ano: %d%n"
					+ "formato: %s%n"
					+ "ator: %s%n"
					+ "atriz: %s%n", 
					listFilmes.get(i).getId(), listFilmes.get(i).getTitulo(),
					listFilmes.get(i).getDuracao(), listFilmes.get(i).getAno(), 
					listFilmes.get(i).getFormato(), listFilmes.get(i).getAtor(),
					listFilmes.get(i).getAtriz()
					);
			System.out.println("===========================================");
			System.out.println();
		}
	}

	public void showCadastroCopias() {
		for (int i = 0; i < copiasFilmes.size(); i++) {
//			System.out.println("Lista Copias de Filmes para alugar");
			System.out.println("===========================================");
			//			
			System.out.println("Titulo do filme: " + copiasFilmes.get(i).getNome());

			if (copiasFilmes.get(i).isAlugada() == true) {
				System.out.println("Filme estar alugado.");				
			} else {
				System.out.println("Filme estar Disponivel.");				
			}
			System.out.println("===========================================");
			System.out.println();
		}
	}

	public void copiaFilme(String nome) {
		for (int i = 0; i < this.listFilmes.size(); i++) {
			if (this.listFilmes.get(i).getTitulo().equals(nome) == true) {
				System.out.println("O filme foi encontrado será copiado");
				String nomeCopia = listFilmes.get(i).getTitulo();
				FilmeCopias filmeCopia = new FilmeCopias(nomeCopia);
				copiasFilmes.add(filmeCopia);
			}
		}

		checkCopiaFilme();
	}

	public void checkCopiaFilme() {
		for (int i = 0; i < copiasFilmes.size(); i++) {
			System.out.println("Lista de Filmes copiados");
			System.out.println(copiasFilmes.get(i));
			System.out.println(copiasFilmes.get(i).getNome());
		}
	}

	public void checkCopiaFilmeAlugados() {
		for (int i = 0; i < copiasFilmesAlugados.size(); i++) {
			System.out.println("Lista de Filmes alugados");
			System.out.println(copiasFilmesAlugados.get(i));
			System.out.println(copiasFilmesAlugados.get(i).getNome());
		}
	}

	public String alugarFilme(String socioBusca, String filmeAlugar) {
		for (int i = 0; i < listSocios.size(); i++) {
			listSocios.get(i);
			if (listSocios.get(i).getNome().equals(socioBusca)) {
				System.out.println("Sim e igual");
				
				for (int j = 0; j < copiasFilmes.size(); j++) {
					copiasFilmes.get(i);
					if (copiasFilmes.get(j).getNome().equals(filmeAlugar)) {
						System.out.println("Sim e igual");
						String nome = copiasFilmes.get(j).getNome();
						boolean alugada = copiasFilmes.get(j).setAlugada(true);
						FilmeCopias filmeCopiaAlugado = new FilmeCopias(nome, alugada);
						copiasFilmes.remove(j);
						copiasFilmesAlugados.add(filmeCopiaAlugado);
						return "Filme alugado com sucesso";
					}
				}
			}
		}
		return "Não foi possivel alugado o filme";
	}
	
	public String devolucao(String filmeAlugado) {
		for (int i = 0; i < copiasFilmesAlugados.size(); i++) {
			copiasFilmesAlugados.get(i);
			String nome = copiasFilmesAlugados.get(i).getNome();
			boolean alugada = copiasFilmes.get(i).setAlugada(false);
			FilmeCopias filmeCopiaDevolucao = new FilmeCopias(nome, alugada);
			copiasFilmes.add(filmeCopiaDevolucao);
			copiasFilmesAlugados.remove(i);
			return "Filme foi devovildo.";
		}
		return "Não foi possivel devolver";
	}

	public void cadastroDeSocio(Socio socio) {
		if(listSocios.isEmpty()){
			System.out.println("Lista de socios vazia vou add");
			listSocios.add(socio);
		} else {
			System.out.println("Lista de socio nao vazia vou add");
			listSocios.add(socio);
		}
		listSocios.size();

	}

	public void showCadastroSocios() {
		for (int i = 0; i < listSocios.size(); i++) {
			//			int id = i;
			//			socio.setId(id);
			System.out.println("Lista de Socios cadastrados");
			System.out.println("===========================================");
			System.out.printf("id: %d%n"
					+ "nome: %s%n"
					+ "endereco: %s%n"
					+ "telefone: %d%n"
					+ "RG: %s%n"
					+ "CPF: %s%n"
					+ "data de Cadastro: %s%n", 
					listSocios.get(i).getId(), listSocios.get(i).getNome(),
					listSocios.get(i).getEndereco(), listSocios.get(i).getTelefone(), 
					listSocios.get(i).getRg(), listSocios.get(i).getCpf(),
					listSocios.get(i).getDate()
					);
			System.out.println("===========================================");
			System.out.println();

		}
	}
}