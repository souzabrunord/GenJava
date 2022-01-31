package Exercícios;

import java.util.Scanner;

public class lacos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia = new Scanner(System.in);
		
		int idade, total50=0, total21=0;
		
		System.out.println("Informe uma idade:");
		idade = leia.nextInt();
		
		while(idade != -99) {
			
			if(idade > 50) {
				total50++;
			} else if(idade<21) {
				total21++;
			}
			
			System.out.println("Informe uma idade:");
			idade = leia.nextInt();
		}
		
		System.out.println("O númedo de pessoas acima dos 50 anos foi de: "+total50
				+ " \nE o número de pessoas abaixo de 21 anos foi de: "+total21);

	}

}
