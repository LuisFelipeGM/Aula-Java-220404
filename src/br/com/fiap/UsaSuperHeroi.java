package br.com.fiap;

public class UsaSuperHeroi {
	public static void main(String[] args) {
		
		SuperHeroi superheroi1 = new SuperHeroi();
		
		superheroi1.setNome("Batman");
		superheroi1.setIdSecreta("Bruce Wayne");
		superheroi1.setPoder("Rico, Viciado em morcegos e cavernas");
		superheroi1.setFraqueza("N�o existe, ele � o BATMAN");
		superheroi1.setVilao("Coronga");
		
		System.out.println("O Nome do H�roi �: " + superheroi1.getNome());
		System.out.println("A identidade secreta do H�roi �: " + superheroi1.getIdSecreta());
		System.out.println("O poder do H�roi �: " + superheroi1.getPoder());
		System.out.println("A fraqueza do H�roi �: " + superheroi1.getFraqueza());
		System.out.println("O Nome do Vil�o do H�roi �: " + superheroi1.getVilao());
	}
}
