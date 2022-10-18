package listaDois;

import java.util.Scanner;

/*13. Elaborar um programa que efetue a leitura do nome e do sexo 
de uma pessoa, apresentando com saída uma das seguintes mensagens: 
"Ilmo Sr.", se o sexo informado como masculino, ou a mensagem "Ilma Sra.", 
para o sexo informado como feminino. Apresente também junto da mensagem 
de saudação o nome previamente informado*/

public class Exercicio13 {

	public static void main(String[] args) {
		String nome;
		char sexo;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome da pessoa: ");
		nome = sc.nextLine();
		System.out.println("Digite o sexo da pessoa: (M/F)");
		sexo = sc.next().charAt(0);

		if (sexo == 'm' || sexo == 'M') {
			System.out.println("Saudações senhor: " + nome);
		} else {
			System.out.println("Saudações senhora: " + nome);
		}

		sc.close();

	}

}
