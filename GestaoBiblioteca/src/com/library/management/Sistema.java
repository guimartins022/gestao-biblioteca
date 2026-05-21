package com.library.management;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Sistema {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Guilherme", 21);
		Cliente c2 = new Cliente("Max", 13);
		Cliente c3 = new Cliente("João", 22);
		
		List<Cliente> clientes = Arrays.asList(c1, c2, c3);
		
		Item livro1 = new Livro("Dom Casmurro", 256, "Machado de Assis", 1899);
		Item livro2 = new Livro("Percy Jackson e os Olimpianos", 400, "Rick Riordan", 2005);
		
		Item dvd1 = new DVD("Interstelar", 169, 2014);
		Item dvd2 = new DVD("Homem-aranha 2", 127, 2004);
		
		List<Item> listaItens = Arrays.asList(livro1, livro2, dvd1, dvd2);
		
		Consumer<String> println = System.out::println;
		Predicate<Cliente> verificarIdade = c -> c.getIdade() >= 14;
		Function<Cliente, String> saudacao = 
				c -> String.format("%s tem idade para pegar emprestado!\n", 
						c.getNome());
		
		clientes.stream()
			.filter(verificarIdade)
			.map(saudacao)
			.forEach(println);
		
		for(Item item: listaItens) {
			System.out.println(item);
			System.out.println("----------");
		}
		
		c1.pegarEmprestado(livro2);
		c1.pegarEmprestado(dvd2);
		
		c2.pegarEmprestado(dvd1);
		c2.pegarEmprestado(livro1);
		
		c3.pegarEmprestado(dvd2);
		
		c1.devolver(dvd2);
		
		c3.pegarEmprestado(dvd2);
		
		for(Item item: listaItens) {
			System.out.println(item);
			System.out.println("----------");
		}
		
	}
	
}
