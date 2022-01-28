package Exercícios;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matriz1 = new int [2][2];
		int [][] matriz2 = new int [2][2];
		int [][] matriz3 = new int [2][2];
		int soma, sub, opc, c=0, d=0;
		Scanner leia = new Scanner(System.in);
		
		
		for (int x = 0 ; x<=1 ; x++) {
			for (int y = 0 ; y<=1 ; y++) {
				
				System.out.println("Matriz 1: Insira o valor da posição ["+x+"]["+y+"]: ");
				matriz1[x][y] = leia.nextInt();
			}
		}
		
				
		for (int x = 0 ; x<=1 ; x++) {
			for (int y = 0 ; y<=1 ; y++) {
						
				System.out.println("Matriz 2: Insira o valor da posição ["+x+"]["+y+"]: ");
				matriz2[x][y] = leia.nextInt();
			}
		}
		
		
		System.out.println("Escolha a opção desejada: ");
		System.out.println("(1): Somar as duas matrizes");
		System.out.println("(2): Subtrair a primeira matriz da segunda");
		System.out.println("(3): Adicionar uma constante as duas matrizes");
		System.out.println("(4): Imprimir as matrizes");
		opc = leia.nextInt();
		
		
		
		switch (opc) {
		
		
		case 1:
					
			
			matriz3[c][d] = matriz1[c][d] + matriz2[c][d];
			
			for (c = 0 ; c<=1 ; c++) {
				for (d = 0 ; d<=1 ; d++) {
							
					System.out.println("O valor da soma das matrizes na posição ["+c+"]["+d+"] é de:  ");
					
				
				}
			}
			
			break;
			
		case 2: 	
		
			
			matriz3[c][d] = matriz1[c][d] - matriz2[c][d];
			
			for (c = 0 ; c<=1 ; c++) {
				for (d = 0 ; d<=1 ; d++) {
							
					System.out.println("O valor da subtração das matrizes na posição ["+c+"]["+d+"] é de:  ");
		}
				}
	
		break;
		
		
		case 3: 
			int con;
			
			System.out.println("Adicione a constante:");
			con = leia.nextInt();
			
			for (c = 0 ; c<=1 ; c++) {
				for (d = 0 ; d<=1 ; d++) {
					
					matriz1[c][d] += con;		
					System.out.println("Matriz 1: O valor da subtração das matrizes na posição ["+c+"]["+d+"] é de: "+matriz1[c][d]);
			
					}
				}
				
			
			for (c = 0 ; c<=1 ; c++) {
				for (d = 0 ; d<=1 ; d++) {
					
					matriz2[c][d] += con;
							
					System.out.println("Matriz 2: O valor da subtração das matrizes na posição ["+c+"]["+d+"] é de: "+matriz2[c][d]);
				}
				}
	
			
		break;
		
		case 4:
			
			for (c = 0 ; c<=1 ; c++) {
				for (d = 0 ; d<=1 ; d++) {
							
					System.out.println("Matriz 1: O valor da subtração das matrizes na posição ["+c+"]["+d+"] é de: "+matriz1[c][d]);
			
					}
				}
				
			for (c = 0 ; c<=1 ; c++) {
				for (d = 0 ; d<=1 ; d++) {
							
					System.out.println("Matriz 2: O valor da subtração das matrizes na posição ["+c+"]["+d+"] é de: "+matriz2[c][d]);
			
					}
				}
			
			
			
			
			
			
			
			
			}
	}
}

	
	
