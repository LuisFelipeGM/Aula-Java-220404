package br.com.fiap;

public class UsaPessoa {
	public static void main(String[] args) {
		// Declarando e instanciando um objeto da classe Pessoa
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		// Definindo nome e idade (setando)
		pessoa1.setNome("Astrogildo");
		pessoa1.setIdade(25);
		pessoa2.setNome("Berada");
		pessoa2.setIdade(18);

		// Exibindo nome e idade
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + pessoa1.getIdade());
		System.out.println("\nNome: " + pessoa2.getNome());
		System.out.println("Nome: " + pessoa2.getIdade());
	}
}
