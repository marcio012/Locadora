package com.locadora.socio;

import com.locadora.filmes.FilmeCopias;

public class Socio {

	private int id = 0;
	private String nome;
	private String endereco;
	private int telefone;
	private String rg;
	private String cpf;
	private String date;
	public FilmeCopias filmeSocioAlugado;

	public Socio() {	}

	public Socio(int id, String nome, String endereco, int telefone, String rg, String cpf, String date) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.rg = rg;
		this.cpf = cpf;
		this.date = date;
		
		System.out.printf("Socio constructor: %n"
				+ "id: %d%n"
				+ "nome: %s%n"
				+ "endereco: %s%n"
				+ "telefone: %d%n"
				+ "RG: %s%n"
				+ "CPF: %s%n" 
				+ "Data: %s%n", id, nome, endereco, telefone, rg, cpf, date);
		
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}


	public String getNome() {
		return nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public int getTelefone() {
		return telefone;
	}


	public String getRg() {
		return rg;
	}


	public String getCpf() {
		return cpf;
	}


	public String getDate() {
		return date;
	}
	
}
