package aula10;

import java.util.Scanner;

public class ClasseExecutavel {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[41m";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int pares = 0;
		int impares = 0;
		int totalPares = 0;
		int totalImpares = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Digite Valores Preencher A Matriz\n");
				matriz[linha][coluna] = scan.nextInt();

			}

		}
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.print(ANSI_RED + "[" + matriz[linha][coluna] + "]" + ANSI_RESET);
				if (matriz[linha][coluna] % 2 == 0) {
					pares++;

				}
				if (matriz[linha][coluna] % 2 == 1) {

					impares = impares + 1;

				}

			}
			System.out.println();

		}
		System.out.println("<><><><><><><><><><><><<><><><>");
		System.out.println(ANSI_RED + " Total De números Pares>> " + pares + " " + ANSI_RESET);
		System.out.println(ANSI_RED + " Total De Números Ímpares>>" + impares + " " + ANSI_RESET);
	}
}
