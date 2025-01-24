package programacao_java_condicional;

import java.util.Scanner;

public class exercicio01_condicional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroInteiro; 
		numeroInteiro = sc.nextInt();
		
		if (numeroInteiro < 0) {
			System.out.println("Este numero é negativo");
		} else if (numeroInteiro > 0) {
			System.out.println("Este numero é positivo");
		}
		
		
		sc.close();
	}
}
