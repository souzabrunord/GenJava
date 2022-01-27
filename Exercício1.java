package Exercícios;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String[] args) {
	
	
	int anos,meses,dias,total;
	
	Scanner leia = new Scanner(System.in);
	
	
	System.out.println("Calcularemos a sua idade em dias, quantos anos você tem? ");
	anos = leia.nextInt() ;
	System.out.println("E em meses? ");
	meses= leia.nextInt() ;
	System.out.println("E dias? ");
	dias= leia.nextInt() ;

	
	total = (anos*365) + (meses*30) + dias ;
	
	System.out.println("\nVocê possui "+total+" dias de vida!!");
	
		
}
}
