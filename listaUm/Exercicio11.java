package listaUm;

import java.util.Scanner;

/*11) Faça um algoritmo para ler: número da conta do cliente,
saldo, débito e crédito. Após, calcular e escrever o saldo 
atual (saldo atual = saldo - débito + crédito). Também testar 
]se saldo atual for maior ou igual a zero escrever a mensagem 
'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.*/

public class Exercicio11 {

	public static void main(String[] args) {
		
		int numeroConta;
		float saldo, debitos, creditos, saldoAtual;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero da conta: ");
		numeroConta = sc.nextInt();
		System.out.println("Digite o saldo atual da conta: ");
		saldo = sc.nextFloat();
		System.out.println("Digite os débitos da conta: ");
		debitos = sc.nextFloat();
		System.out.println("Digite os creditos da connta: ");
		creditos = sc.nextFloat();
		
		saldoAtual = saldo - debitos + creditos;
		
		if (saldoAtual > 0) {
			System.out.println("Usuário: " +numeroConta+" Seu saldo é positivo: " + saldoAtual);
		} else if (saldoAtual == 0) {
			System.out.println("Usuário: " +numeroConta+" Seu saldo é nulo: " + saldoAtual);
		} else {
			System.out.println("Usuário: " +numeroConta+" Seu saldo é negativo: " + saldoAtual);
		}
		
		sc.close();
	}

}
