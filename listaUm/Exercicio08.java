package listaUm;

import java.util.Scanner;

/*8) Ler a hora de início e a hora de fim de um jogo de Xadrez 
(considere apenas horas inteiras, sem os minutos) e calcule a 
duração do jogo em horas, sabendo-se que o tempo máximo de 
duração do jogo é de 24 horas e que o jogo pode iniciar em um 
dia e terminar no dia seguinte.*/

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iniciojogo, fimJogo, duracaoJogo;

		System.out.println("Digite o horario de inicio do jogo");
		iniciojogo = sc.nextInt();
		System.out.println("Digite o horario de termino do jogo");
		fimJogo = sc.nextInt();

		if (iniciojogo >= fimJogo) {

			duracaoJogo = 24 - (iniciojogo - fimJogo);
			System.out.println("Duração do jogo: " + duracaoJogo + "h");
		} else {
			duracaoJogo = fimJogo - iniciojogo;
			System.out.println("Duração do jogo: " + duracaoJogo + "h");
		}

		sc.close();
	}

}
