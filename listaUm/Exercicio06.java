package listaUm;

import java.util.Scanner;

// 6) Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor1, valor2;

		System.out.print("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.print("Digite o primeiro valor: ");
		valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("O Primeiro valor digitado é maior");
		} else {
			System.out.println("O Segundo valor digitato é maior");
		}

		sc.close();
	}

}
