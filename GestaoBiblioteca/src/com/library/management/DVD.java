package com.library.management;

public class DVD extends Item {

	private final int duracao;
	
	public DVD(String nome, int duracao, int ano) {
		super(nome, ano);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
		String.format("Minutos: %d", 
				duracao);
	}
	
}
