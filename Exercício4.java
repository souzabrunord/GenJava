package Exercícios;

import java.util.Scanner;

public class Exercício4 {
	public static void main(String[] args) {
	
	double A,B,C,D,R,S;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Qual o valor de A?");
	A= leia.nextInt();
	System.out.println("Qual o valor de B?");
	B= leia.nextInt();
	System.out.println("Qual o valor de C?");
	C= leia.nextInt();
	
	R = Math.pow(A+B, 2);
	S = Math.pow(B+C, 2);
	
	D= (R+S) / 2 ;
			
	System.out.printf("\nCom os valores de A, B e C dados o resultado da equação (R + S) / 2 é igual a %2.0f ",D);			
		
		
				
		
		
	}	
}
