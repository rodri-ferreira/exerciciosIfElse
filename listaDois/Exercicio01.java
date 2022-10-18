package listaDois;

import java.util.Scanner;

//1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.

public class Exercicio01 {

	public static void main(String[] args) {
		int valor01, valor02, subtracao;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor01 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor02 = sc.nextInt();
		
		if (valor01 > valor02) {
			subtracao = valor01 - valor02;
			System.out.println("O valor " + valor01 + " - " + valor02 + " = " + subtracao);
		} else {
			subtracao = valor02 - valor01;
			System.out.println("O valor " + valor02 + " - " + valor01 + " = " + subtracao);
		}
		
		
		sc.close();
	}

}
