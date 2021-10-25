package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

  public static void main(String[] args) {
	  
	  Gato gato = new Gato();
	  Livros Livros = new Livros();
	  
	  System.out.println(gato);
	  System.out.println(Livros);
	  /*int a = 5;
	  int b = 12;
	System.out.println("Olá Samantha " + (a+b));*/
    }
  
}

class Livros {
	private String nome;
	private String npag;
}
