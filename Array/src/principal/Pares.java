package principal;

import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite aqui o número: ");
			numeros[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println("Número Par "+numeros[i]+" que está no índice "+i);
			
			}
		}
		
		entrada.close();
	}

}
