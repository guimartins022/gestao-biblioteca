package com.library.management;

public class Livro extends Item {

	private final int numPaginas;
	private final String autor;
	
	public Livro(String nome, int numPaginas, String autor, int ano) {
		super(nome, ano);
		this.numPaginas = numPaginas;
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
		String.format("Páginas: %d\nAutor: %s", 
				numPaginas, autor);
	}
	
}
