package Exercícios;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] vetor = new int[6];
		int soma;
		
		
		vetor[0] = 1;
		vetor[1] = 0;
		vetor[2] = 5;
		vetor[3] = -2;
		vetor[4] = -5;
		vetor[5] = 7;
		
		soma = vetor[0] + vetor[1] + vetor[5];
		
		System.out.println("O valor da soma dos vetores da posição 0, 1 e 5 é de: "+soma);
		
		
		vetor[4] = 100;
				
				
		for (int x = 0; x<=5; x++) {
			
			
			System.out.println("\nO valor do vetor A na posição "+x+" é de: "+vetor[x]);
		}
		
		
		

	}

}
