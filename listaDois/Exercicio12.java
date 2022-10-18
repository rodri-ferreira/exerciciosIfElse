package listaDois;

import java.util.Scanner;

/*12. Elaborar um programa que efetue a leitura de um determinado valor 
inteiro, e efetue a sua apresentação, caso o valor não seja maior que três.*/

public class Exercicio12 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite um número: ");
		numero = sc.nextInt();
		
		if (numero < 3) {
			System.out.println(numero);
		}
		
		sc.close();
	}

}
