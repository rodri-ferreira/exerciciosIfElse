package listaUm;

import java.util.Scanner;

/*10) Ler o salário fixo e o valor das vendas efetuadas pelo 
vendedor de uma empresa. Sabendo-se que ele recebe uma com
issão de 3% sobre o total das vendas até R$ 1.500,00 mais 
5% sobre o que ultrapassar este valor, calcular e escrever 
o seu salário total.*/

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float salario, vendas, salarioTotal;

		System.out.println("Digite o salario fixo do funcionário: ");
		salario = sc.nextFloat();
		System.out.println("Digite o valor das vendas do funcionário: ");
		vendas = sc.nextFloat();

		if (vendas > 1500) {
			salarioTotal = (1500 * 3 / 100) + ((vendas - 1500) * 5 / 100) + salario;
			System.out.println("O Salario do funcionário é: R$ " + salarioTotal);
		} else {
			salarioTotal = salario + (1500 * 3 / 100);
			System.out.println("O Salário do funcionário é: R$ " + salarioTotal);
		}

		sc.close();
	}

}
