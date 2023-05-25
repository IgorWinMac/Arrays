package principal;

import java.util.Random;
import java.util.Scanner;

public class Selecao {

	public static void main(String[] args) {

		Random aleatorio = new Random();

		Scanner entrada = new Scanner(System.in);

		String[] pessoas = new String[5];

		int num = aleatorio.nextInt(5);

		for (int i = 0; i < pessoas.length; i++) {
			System.out.println("Cadastre aqui as pessoas: ");
			pessoas[i] = entrada.nextLine();
		}

		char opcao;

		do {
			System.out.println("Deseja reaizar o sorteio agora: ");
			opcao = entrada.nextLine().charAt(0);

			if (opcao == 's') {
				System.out.println("A pessoa sorteada está na posição " + num);

			} else {
				System.out.println("Saindo então...");

			}
		} while (opcao == 's');

		entrada.close();
	}

}
