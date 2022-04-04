package br.com.fiap;

import java.util.Scanner;

public class UsaPessoa2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome e idade");
		pessoa1.setNome(scan.next());
		pessoa1.setIdade(scan.nextInt());
		
		System.out.println("Nome: " + pessoa1.getNome());
		System.out.println("Idade: " + pessoa1.getIdade());
		
	}
}
