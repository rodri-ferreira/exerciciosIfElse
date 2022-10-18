package listaDois;

import java.util.Scanner;

/*4. Ler quatro valores referentes a quatro notas escolares de
um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado
,se o valor da média escolar for maior ou igual a 5. Se o valor da 
média for menor que 7,solicitar a nota de exame,somar com o valor
da média e obter nova média.Se a nova média for maior ou igual a 5
,apresentar uma mensagem dizendo que o aluno foi aprovado em exame
.Se o aluno não foi aprovado,indicar uma mensagem informando esta
condição.Apresentar com as mensagens o valor da média do aluno,para 
qualquer condição.*/

public class Exercicio04 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media, notaRecu, mediaComRecu = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota do aluno: ");
		nota1 = sc.nextFloat();
		System.out.print("Digite a segunda nota do aluno: ");
		nota2 = sc.nextFloat();
		System.out.print("Digite a terceira nota do aluno: ");
		nota3 = sc.nextFloat();
		System.out.print("Digite a quarta nota do aluno: ");
		nota4 = sc.nextFloat();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 7) {
			System.out.println("Você foi aprvado! " + media);
		} else {
			System.out.println("Você está de recuperação " + media);
			System.out.println();
			System.out.print("Nota da prova recuperação: ");
			notaRecu = sc.nextFloat();
			mediaComRecu = (media + notaRecu) / 2;

			if (mediaComRecu >= 5) {
				System.out.println("Você conseguiu recuperar, está aprovado! " + mediaComRecu);
			} else {
				System.out.println("Você não conseguiu recuperar, está reporvado! " + mediaComRecu);
			}
		}

		sc.close();
	}
}
