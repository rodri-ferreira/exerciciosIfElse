package listaUm;


import java.util.Scanner;

/*9) A jornada de trabalho semanal de um funcionário é de 40 horas. 
O funcionário que trabalhar mais de 40 horas receberá hora extra, 
cujo cálculo é o valor da hora regular com um acréscimo de 50%. 
Escreva um algoritmo que leia o número de horas trabalhadas em um 
mês, o slalário por hora e escreva o salário total do funcionário, 
que deverá ser acrescido das horas extras, caso tenham sido trabalhadas 
(considere que o mês possua 4 semanas exatas).*/

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasTrabalhadas;
		float valorPorHora, salarioTotal;

		System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
		horasTrabalhadas = sc.nextInt();
		System.out.print("Digite quantos uma hora de trabalho vale em R$: ");
		valorPorHora = sc.nextFloat();

		if (horasTrabalhadas > 160) {
			salarioTotal = (horasTrabalhadas * valorPorHora)
					+ (((float) horasTrabalhadas - 160) * valorPorHora) * 50 / 100;
			System.out.println("Salário final do funcionário: R$ " + salarioTotal);
		} else {
			salarioTotal = horasTrabalhadas * valorPorHora;
			System.out.println("Salário final do funcionario: R$ " + salarioTotal);
		}

		sc.close();

	}

}
