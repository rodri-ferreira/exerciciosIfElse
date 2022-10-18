package listaDois;

import java.util.Scanner;

/*10. Elaborar um programa que efetue a leitura de um número inteiro e 
apresentar uma mensagem informando se o número é par ou ímpar.*/

public class Exercicio10 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número " + numero + " é par");
		} else {
			System.out.println("O número " + numero + " é ímpar");
		}
		
		sc.close();

	}

}
