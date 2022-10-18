package listaUm;

import java.util.Scanner;

/*4) Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular
a média aritmética simples e escrever uma mensagem que diga se 
o aluno foi ou não aprovado (considerar que nota igual ou maior 
que 6 o aluno é aprovado). Escrever também a média calculada.*/

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float nota01, nota02, media;

		System.out.print("Digite a primeira nota: ");
		nota01 = sc.nextFloat();
		System.out.print("Digite a segunda nota: ");
		nota02 = sc.nextFloat();

		media = (nota01 + nota02) / 2;

		if (media >= 6) {
			System.out.print("O aluno passou de ano, média: " + media);
		} else {
			System.out.println("O aluno não passou de ano, média: " + media);
		}

		sc.close();
	}

}
