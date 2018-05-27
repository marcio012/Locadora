package com.locadora.filmes;

public class FilmeCopias {

	private int id;
	private String nome;
	private boolean alugada;
	
	
	// construtor 
	public FilmeCopias() {}

	// construtor 
	public FilmeCopias(String nome) {
		this.nome = nome;
		this.alugada = false;
	}

	// construtor completo	
	public FilmeCopias(String nome, boolean alugada) {
		this.nome = nome;
		this.alugada = alugada;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAlugada() {
		return alugada;
	}

	public boolean setAlugada(boolean alugada) {
		return this.alugada = alugada;
	}
}
