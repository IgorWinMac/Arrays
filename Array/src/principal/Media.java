package principal;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		double soma = 0;
		double media;
		int qtd;
		
		System.out.println("Digite o nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Informe a quantidade de notas: ");
		qtd = entrada.nextInt();
		
		double[] notas = new double[qtd];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota: ");
			notas[i] = entrada.nextDouble();
			soma = soma + notas[i];
		}
		
		System.out.println("A soma das notas é: "+soma);
		
		media = soma / notas.length;
		
		System.out.println("A média final é de: "+media);
		
		
		entrada.close();

	}

}
