package programacao_java_condicional;

import java.util.Scanner;

public class exercicio02_condicional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroMultiplo1, numeroMultiplo2; 
		numeroMultiplo1 = sc.nextInt();
		numeroMultiplo2 = sc.nextInt();
		
		if (numeroMultiplo1 % numeroMultiplo2 == 0  || numeroMultiplo2 % numeroMultiplo1 == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não são multiplos");
		}
		sc.close();
	}
}
