package listaDois;

import java.util.Scanner;

/*2. Efetuar a leitura de um valor inteiro positivo ou negativo 
e apresentar o número lido como sendo um valor positivo, ou seja
, o programa deverá apresentar o módulo de um número fornecido. 
Lembre-se de verificar se o número fornecido é menor que zero; 
sendo, multiplique-o por -1.*/

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;

		System.out.print("Digite um número postivo ou negativo: ");
		numero = sc.nextInt();

		if (numero < 0) {
			System.out.println(numero * -1);
		} else {
			System.out.println(numero);
		}

		sc.close();
	}

}

