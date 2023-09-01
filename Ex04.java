package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade, categoria, idadeM = 0, idadeMe = 0, sexo, homem = 0, mulher = 0, back = 0, front = 0, mobile = 0, full = 0, mf = 0, mft = 0, hm = 0;
		String sN;
		
		System.out.print("Deseja continuar (S/N): ");
		sN = ler.next();

		while(sN.equalsIgnoreCase("S")) {
	
		System.out.print("Digite a Idade: ");
		idade = ler.nextInt();
		if (idade > 40) {
			idadeM++;
		} else if (idade < 30) {
			idadeMe++;
		}

		System.out.print("1-Masculino | 2-Feminino | 3-Outro");
		System.out.print("\nDigite o Sexo:");
		sexo = ler.nextInt();
		if (sexo == 1) {
			homem++;
		}else if(sexo == 2) {
			mulher++;
		}else {
			System.out.println("Opção Inválida");
		}
		System.out.print("1-Backend |2-Frontend |3-Mobile |4-FullStack");
		System.out.print("\nDigite a Categoria: ");
		categoria = ler.nextInt();
		if (categoria == 1) {
			back++;
		}else if(categoria == 2) {
			front++;
		}else if(categoria == 3) {
			mobile++;
		}else if(categoria == 4) {
			full++;
		}else{
			System.out.println("Opção Inválida");
		}
		
		System.out.print("Deseja continuar (S/N): ");
		sN = ler.next();
		
		if (sexo == 2 && categoria == 2) {
			mf++;
		}
		if (sexo == 1 && categoria == 3 && idade > 40) {
			hm++;
		}
		if (sexo == 2 && categoria == 4 && idade < 30) {
			mft++;
		}
	}
		System.out.println("Total de pessoas desenvolvedoras Backend: " + back);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + mf);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + hm);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + mft);
		
		ler.close();
}
}