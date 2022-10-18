package listaDois;

import java.util.Scanner;

/*3. Ler quatro valores referentes a quatro notas escolares de 
um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado, 
se o valor da média escolar for maior ou igual a 5. Se o aluno 
não foi aprovado, indicar uma mensagem informando esta condição. 
Apresentar junto das mensagens o valor da média do aluno para 
qualquer condição.*/

public class Exercicio03 {

	public static void main(String[] args) {
		float nota1, nota2, nota3, nota4, media;
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

		if (media >= 5) {
			System.out.println("Você foi aprvado! " + media);
		} else {
			System.out.println("Você foi reprovado! " + media);
		}
		
		sc.close();
	}

}
