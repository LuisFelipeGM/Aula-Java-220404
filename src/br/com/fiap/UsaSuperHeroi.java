package br.com.fiap;

public class UsaSuperHeroi {
	public static void main(String[] args) {
		
		SuperHeroi superheroi1 = new SuperHeroi();
		
		superheroi1.setNome("Batman");
		superheroi1.setIdSecreta("Bruce Wayne");
		superheroi1.setPoder("Rico, Viciado em morcegos e cavernas");
		superheroi1.setFraqueza("Não existe, ele é o BATMAN");
		superheroi1.setVilao("Coronga");
		
		System.out.println("O Nome do Héroi é: " + superheroi1.getNome());
		System.out.println("A identidade secreta do Héroi é: " + superheroi1.getIdSecreta());
		System.out.println("O poder do Héroi é: " + superheroi1.getPoder());
		System.out.println("A fraqueza do Héroi é: " + superheroi1.getFraqueza());
		System.out.println("O Nome do Vilão do Héroi é: " + superheroi1.getVilao());
	}
}
