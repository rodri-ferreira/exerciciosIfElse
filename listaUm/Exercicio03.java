package listaUm;

import java.util.Scanner;

/*3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, 
e R$ 1,00 se foremcompradas pelo menos 12. Escreva um programa que leia 
o número de maçãs compradas, calcule e escreva o custo total da compra.*/
public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int totalMacas;
		float valorTotal;

		System.out.print("Digite quantas maçãs quer comprar: ");
		totalMacas = sc.nextInt();

		if (totalMacas <= 11) {
			valorTotal = totalMacas * 1.30f;
			System.out.println("O valor da compra: " + valorTotal);
		} else {
			valorTotal = totalMacas;
			System.out.println("o valor da compra: " + valorTotal);
		}

		sc.close();
	}

}
