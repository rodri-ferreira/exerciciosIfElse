package listaUm;

import java.util.Scanner;

/*12) Faça um algoritmo para ler: quantidade atual em estoque,
quantidade máxima em estoque e quantidade mínima em estoque 
de um produto. Calcular e escrever a quantidade média 
((quantidademédia = quantidade máxima + quantidade mínima)/2). 
Se a quantidade em estoque for maior ou igual a quantidade média 
escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 
'Efetuar compra'.*/

public class Exercicio12 {

	public static void main(String[] args) {
		
		float quantidadeAtual, quantidadeMaxima, quantidadeMinima, quantidadeMedia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade atual no estoque: ");
		quantidadeAtual = sc.nextFloat();
		System.out.println("Digite a quantidade máxima que o estóque comporta: ");
		quantidadeMaxima = sc.nextFloat();
		System.out.println("Digite a quantidade minima no estoque: ");
		quantidadeMinima = sc.nextFloat();
		
		quantidadeMedia = (quantidadeMaxima + quantidadeMinima) /2;
		
		if (quantidadeAtual >= quantidadeMedia) {
			System.out.println("Não precisa efetuar a compra");
		} else {
			System.out.println("Efetuar a compra");
		}
		sc.close();
	}

}
