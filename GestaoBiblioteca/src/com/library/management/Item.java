package com.library.management;

public class Item {

	private final String nome;
	private final int ano;
	private boolean disponivel = true;
	
	public Item(String nome, int ano) {
		this.nome = nome;
		this.ano = ano;
	}
	
	public void emprestar() {
		disponivel = false;
		System.out.printf("O item '%s' foi emprestado!\n", nome);
		System.out.println();
	}
	
	public void receber() {
		disponivel = true;
		System.out.printf("O item '%s' foi devolvido!\n", nome);
		System.out.println();
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public String getNome() {
		return nome;
	}

	public int getAno() {
		return ano;
	}
	
	@Override
	public String toString() {
		return String.format("Nome: %s\nAno: %d\nDisponível: %b\n", 
				nome, ano, disponivel);
	}
	
}
