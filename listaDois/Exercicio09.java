package listaDois;

import java.util.Scanner;

// 9. Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.

public class Exercicio09 {

	public static void main(String[] args) {
		float valor1, valor2, valor3, valor4, valor5;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		valor1 = sc.nextFloat();
		System.out.print("Digite o segundo valor: ");
		valor2 = sc.nextFloat();
		System.out.print("Digite o terceiro valor: ");
		valor3 = sc.nextFloat();
		System.out.print("Digite o quarto valor: ");
		valor4 = sc.nextFloat();
		System.out.print("Digite o quinto valor: ");
		valor5 = sc.nextFloat();

		// maior

		if (valor1 >= valor2 && valor1 >= valor3 && valor1 >= valor4 && valor1 >= valor5) {
			System.out.println("Maior valor " + valor1);
		} else if (valor2 >= valor1 && valor2 >= valor3 && valor2 >= valor4 && valor4 >= valor5) {
			System.out.println("Maior valor " + valor2);
		} else if (valor3 >= valor1 && valor3 >= valor2 && valor3 >= valor4 && valor3 >= valor5) {
			System.out.println("Maior valor " + valor3);
		} else if (valor4 >= valor1 && valor4 >= valor2 && valor4 >= valor3 && valor4 >= valor5) {
			System.out.println("Maior valor " + valor4);
		} else {
			System.out.println("Maior valor " + valor5);
		}

		// menor

		if (valor1 <= valor2 && valor1 <= valor3 && valor1 <= valor4 && valor1 <= valor5) {
			System.out.println("Menor valor " + valor1);
		} else if (valor2 <= valor1 && valor2 <= valor3 && valor2 <= valor4 && valor4 <= valor5) {
			System.out.println("Menor valor " + valor2);
		} else if (valor3 <= valor1 && valor3 <= valor2 && valor3 <= valor4 && valor3 <= valor5) {
			System.out.println("Menor valor " + valor3);
		} else if (valor4 <= valor1 && valor4 <= valor2 && valor4 <= valor3 && valor4 <= valor5) {
			System.out.println("Menor valor " + valor4);
		} else {
			System.out.println("Menor valor " + valor5);
		}

		sc.close();
	}

}
