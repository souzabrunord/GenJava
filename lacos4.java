package Exerc�cios;

import java.util.Scanner;

public class lacos4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, sexo, opc, totalCalm=0, mulherNerv=0, homemAgro=0; 
		int outroCalm=0, nerv40=0, calm18=0, totalPe=0;

		Scanner leia = new Scanner(System.in);
		
		while(totalPe<5) {
			System.out.println("Informe a sua idade:");
			idade = leia.nextInt();
			System.out.println("Informe o seu sexo(1-feminino / 2-masculino / 3-Outros):");
			sexo = leia.nextInt();
			System.out.println("Informe a op��o (1-calma; 2-nervosa e 3-agressiva):");
			opc = leia.nextInt();
			
			if(opc == 1) {
				totalCalm++;
				if (sexo == 3) {
					outroCalm++;
				}
				if (idade < 18) {
					calm18++;
				}
			}
			
			if(opc == 2) {
				if(sexo == 1) {
					mulherNerv++;
				}
				if(idade > 40) {
					nerv40++;
				}
			}
			
			if(sexo == 2 && opc ==3) {
				homemAgro++;
			}
			totalPe++;
		}
		
		System.out.println("O n�mero de pessoas calmas � de: "+totalCalm);
		System.out.println("O n�mero de mulheres nervosas � de: "+mulherNerv);
		System.out.println("O n�mero de homens agressivos � de: "+homemAgro);
		System.out.println("O n�mero de outros calmos � de: "+totalCalm);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos � de: "+totalCalm);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos � de: "+totalCalm);

	}
	}
