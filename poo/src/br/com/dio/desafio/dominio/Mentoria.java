package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {
	
	private String nome;
	private String descricao;
	private LocalDate data;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Mentoria\nnome: " + nome + ",\ndescrição: " + descricao + ",\ndata: " + data + "\n";
	}
	
	

}
