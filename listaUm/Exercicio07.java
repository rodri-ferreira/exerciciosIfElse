package listaUm;

import java.util.Scanner;

// 7) Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor01, valor02;

		System.out.print("Digite o primeiro valor: ");
		valor01 = sc.nextInt();
		System.out.print("Digite o primeiro valor: ");
		valor02 = sc.nextInt();

		if (valor01 < valor02) {
			System.out.print("Ordem crescente: " + valor01 + ", "+ valor02);
		} else {
			System.out.print("Ordem Crescente: " + valor02 + ", "+ valor01);
		}

		sc.close();
	}

}
