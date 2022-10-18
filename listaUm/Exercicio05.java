package listaUm;

import java.util.Scanner;

/*5) Ler o ano atual e o ano de nascimento de uma pessoa. Escrever 
uma mensagem que diga se ela poderá ou não votar este ano 
(não é necessário considerar o mês em que a pessoa nasceu).*/

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anoNascomento, anoAtual, idade;

		System.out.print("Digite o ano que voce nasceu: ");
		anoNascomento = sc.nextInt();
		System.out.print("Digite o ano atual: ");
		anoAtual = sc.nextInt();

		idade = anoAtual - anoNascomento;

		if (idade >= 16) {
			System.out.println("Você pode votar esse ano");
		} else {
			idade = ((anoAtual - anoNascomento) - 16 )* (-1);
			System.out.println("Você não pode votar ano, só poderá votar daqui a: " + idade);
		}

		sc.close();
	}

}
