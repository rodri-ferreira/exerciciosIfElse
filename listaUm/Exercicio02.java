package listaUm;

import java.util.Scanner;

// 2) Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		
		System.out.print("Digite um valor: ");
		numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("Número positivo");
		} else if (numero == 0) {
			System.out.println("Número zero");
		} else {
			System.out.println("Número negativo");
		}
		
		sc.close();
	}

}
