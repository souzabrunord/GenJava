package Exerc�cios;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		
		int ano,mes,dia,dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Voc� possui quantos dias de vida?");
		dia = leia.nextInt() ;
		
		ano= dia / 365 ;

		mes = (dia % 365) / 30 ;

		dias = ((dia % 365) % 30);
		
		
		System.out.println("\nVoc� possui "+ano+" anos, "+mes+" meses e "+dias+" dias");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
