package br.com.fiap;

import java.util.Scanner;

public class UsaSuperHeroi2 {
	public static void main(String[] args) {
		
		SuperHeroi sh1 = new SuperHeroi();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Nome do Super H�roi: ");
		sh1.setNome(scan.next());
		System.out.println("Digite a Identidade Secreta do Super H�roi: ");
		sh1.setIdSecreta(scan.next());
		System.out.println("Digite o Poder do Super H�roi: ");
		sh1.setPoder(scan.next());
		System.out.println("Digite a Fraqueza do Super H�roi: ");
		sh1.setFraqueza(scan.next());
		System.out.println("Digite o nome do Vil�o do Super H�roi: ");
		sh1.setVilao(scan.next());
		
		System.out.println("O Nome do H�roi �: " + sh1.getNome());
		System.out.println("A identidade secreta do H�roi �: " + sh1.getIdSecreta());
		System.out.println("O poder do H�roi �: " + sh1.getPoder());
		System.out.println("A fraqueza do H�roi �: " + sh1.getFraqueza());
		System.out.println("O Nome do Vil�o do H�roi �: " + sh1.getVilao());
		
		
	}
}
