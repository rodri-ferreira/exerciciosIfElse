package listaDois;

import java.util.Scanner;

/*6. Efetuar a leitura de três valores (variáveis A, B e C) 
e efetuar o cálculo da equação completa de segundo grau, 
apresentando as duas raízes, se para os valores informados 
for possível efetuar o referido cálculo. Lembre-se de que 
a variável A deve ser diferente de zero.*/

public class Exercicio06 {

	public static void main(String[] args) {
		float a, b, c, delta, x1, x2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Equação do segudo grau!");
		System.out.println("-----------------------");
		System.out.print("Digite o valor A: ");
		a = sc.nextFloat();
		System.out.print("Digite o valor B: ");
		b = sc.nextFloat();
		System.out.print("Digite o valor C: ");
		c = sc.nextFloat();

		delta = (float) Math.pow(b, 2) - 4 * a * c;
		System.out.println(delta);

		if (delta > 0) {
			
			System.out.println();
			System.out.println("Delta > 0, portanto existem 2 raizes reais");
			x1 = (-(b) + (float) Math.sqrt(delta)) / 2 * a;
			x2 = (-(b) - (float) Math.sqrt(delta)) / 2 * a;
			System.out.println("x1: " + x1 + ", " + "x2: " + x2);
			
		} else if (delta == 0) {
			
			System.out.println();
			System.out.println("Delta = 0, portanto uma raiz!");
			x1 = (-(b) + (float) Math.sqrt(delta)) / 2 * a;
			System.out.println(x1);
			
		} else {
			
			System.out.println();
			System.out.println("Não há raizes reais");
		}

		sc.close();
	}

}
