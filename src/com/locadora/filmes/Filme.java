package com.locadora.filmes;

public class Filme {

	private int id = 0;
	private String titulo;
	private int duracao;
	private int ano;
	private String formato;
	private String ator;
	private String atriz;
//	public CadastraFilme(); 
	
	/**
	 * @param id
	 * @param titulo
	 * @param duarcao
	 * @param ano
	 * @param formato
	 * @param ator
	 * @param atriz
	 */
	
	public Filme(int id, String titulo, int duracao, int ano, String formato, String ator, String atriz) {
		this.id = id;
		this.titulo = titulo;
		this.duracao = duracao;
		this.ano = ano;
		this.formato = formato;
		this.ator = ator;
		this.atriz = atriz;
//		++id;
		System.out.printf("Filme constructor: "
				+ "id: %d%n"
				+ "titulo: %s%n"
				+ "duracao: %d%n"
				+ "ano: %d%n"
				+ "formato: %s%n"
				+ "ator: %s%n"
				+ "atriz: %s%n", id, titulo, duracao, ano, formato, ator, atriz);
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracao() {
		return duracao;
	}

	public int getAno() {
		return ano;
	}

	public String getFormato() {
		return formato;
	}

	public String getAtor() {
		return ator;
	}

	public String getAtriz() {
		return atriz;
	}
	
	
}
