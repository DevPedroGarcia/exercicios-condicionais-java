package programacao_java_condicional;

import java.util.Scanner;

public class exercicio04_condicional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo, quantidade;

		codigo = sc.nextInt();
		quantidade = sc.nextInt();

		double total;
		if (codigo == 1) {
			total = quantidade * 4.0;
			System.out.printf("Total: R$ %.2f%n", total);
		} else if (codigo == 2) {
			total = quantidade * 4.5;
			System.out.printf("Total: R$ %.2f%n", total);
		} else if (codigo == 3) {
			total = quantidade * 5.0;
			System.out.printf("Total: R$ %.2f%n", total);
		} else if (codigo == 4) {
			total = quantidade * 2.0;
			System.out.printf("Total: R$ %.2f%n", total);
		} else if (codigo == 5) {
			total = quantidade * 1.5;
			System.out.printf("Total: R$ %.2f%n", total);
		}
		
		sc.close();
	}
}
