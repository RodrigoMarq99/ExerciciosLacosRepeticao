package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, pessoasMenor = 0, pessoasMaior = 0;
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while(idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade < 21) {
				pessoasMenor++;
			}else if(idade > 50){
				pessoasMaior++;
			}
			
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: " + pessoasMenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + pessoasMaior);
	}

}
