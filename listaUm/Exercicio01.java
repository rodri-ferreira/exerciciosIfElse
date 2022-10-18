package listaUm;

import java.util.Scanner;

/*1) Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso
contrário escrever NÃO É MAIOR QUE 10!*/

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor;

		System.out.print("Digite um valor: ");
		valor = sc.nextInt();

		if (valor > 10) {
			System.out.println("Valor maior que 10");
		} else if (valor == 10) {
			System.out.println("Valor igual a 10");
		} else {
			System.out.println("Valor menor que 10");
		}

		sc.close();
	}

}
