package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int primeiroNum, segundoNum;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		primeiroNum = leia.nextInt();
		System.out.println("Digite o segundo número do intervalo: ");
		segundoNum = leia.nextInt();
		
		if(primeiroNum < segundoNum) {
			for(int contador = primeiroNum; contador <= segundoNum; contador++) {
				if(contador % 3 == 0 && contador % 5 == 0) {
					System.out.println("\n"+ contador + " é múltiplo de 3 e 5");
				}
			}
		}else {
			System.out.println("Intervalo inválido!");
		}
		
	}

}
