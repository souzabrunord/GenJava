package Exercícios;

import java.util.Scanner;

public class lacos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int num1, num2, num3, maior=0;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Entre com o número 1:");
			num1 = leia.nextInt();
			System.out.println("Entre com o número 2:");
			num2 = leia.nextInt();
			System.out.println("Entre com o número 3:");
			num3 = leia.nextInt();
			
			if (num1 > maior) {
				maior = num1;
			}
			if (num2 > maior) {
				maior = num2;
			}
			if (num3 > maior) {
				maior = num3;
			}
			
			System.out.println("O maior número digitado foi: "+maior);

		}

	
	}

