package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num, pares = 0, impares = 0;
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.println(contador+"° número: ");
			num = leia.nextInt();
			if(num % 2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		System.out.println("\nTotal de números pares: " + pares);
		System.out.println("Total de números ímpares: " + impares);
		
		leia.close();
	}

}
