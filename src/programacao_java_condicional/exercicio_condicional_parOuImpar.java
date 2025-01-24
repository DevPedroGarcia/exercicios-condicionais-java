package programacao_java_condicional;

import java.util.Scanner;

public class exercicio_condicional_parOuImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Este numero é par");
		} else {
			System.out.println("Este numero é impar");
		}
		
		sc.close();
	}
}
