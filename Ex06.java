package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int num, total = 0, contador = 0;
		float media;
		do {
			System.out.println("Digite um número ou 0 para encerrar: ");
			num = leia.nextInt();
			if (num % 3 == 0 && num != 0) {
				total += num;
				contador += 1;
			}
		} while (num != 0);

		if (contador != 0) {
			media = (total / contador);
			System.out.printf("A média de todos os números múltiplos de 3 é: %.1f", media);
		} else {
			System.out.printf("Não foram inseridos números válidos!");
		}

	}

}
