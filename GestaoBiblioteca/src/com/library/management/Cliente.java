package com.library.management;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private final String nome;
	private int idade;
	
	private List<Item> itens = new ArrayList<>();
	
	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void pegarEmprestado(Item item) {
		if(idade >= 14 && item.isDisponivel()) {
			itens.add(item);
			item.emprestar();			
		} else if(idade < 14) {
			System.out.println("Necessário um responsável para pegar emprestado.\n");
		} else if(item.isDisponivel() == false) {
			System.out.println("O item não está disponível.\n");
		} else {
			System.out.println("Não foi possível pegar emprestado.\n");
		}
	}
	
	public void devolver(Item item) {
		if(!item.isDisponivel() && itens.contains(item)) {
			itens.remove(item);
			item.receber();			
		} else {
			System.out.println("Você não possui este item.\n");
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	
}
