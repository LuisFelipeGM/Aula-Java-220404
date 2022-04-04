package br.com.fiap;

import java.util.Scanner;

public class UsaSuperHeroi2 {
	public static void main(String[] args) {
		
		SuperHeroi sh1 = new SuperHeroi();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Nome do Super Héroi: ");
		sh1.setNome(scan.next());
		System.out.println("Digite a Identidade Secreta do Super Héroi: ");
		sh1.setIdSecreta(scan.next());
		System.out.println("Digite o Poder do Super Héroi: ");
		sh1.setPoder(scan.next());
		System.out.println("Digite a Fraqueza do Super Héroi: ");
		sh1.setFraqueza(scan.next());
		System.out.println("Digite o nome do Vilão do Super Héroi: ");
		sh1.setVilao(scan.next());
		
		System.out.println("O Nome do Héroi é: " + sh1.getNome());
		System.out.println("A identidade secreta do Héroi é: " + sh1.getIdSecreta());
		System.out.println("O poder do Héroi é: " + sh1.getPoder());
		System.out.println("A fraqueza do Héroi é: " + sh1.getFraqueza());
		System.out.println("O Nome do Vilão do Héroi é: " + sh1.getVilao());
		
		
	}
}
