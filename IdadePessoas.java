// Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa. Veja o exemplo abaixo: //

package atividades;

import java.util.Scanner;

public class IdadePessoas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade;
		int menor21 = 0;
		int maior50 = 0;

		System.out.println("Digite a idade das pessoas (digite uma idade negativa para encerrar):");


		while (true) { //Enquanto a idade digitada não for negativa, o código continua rodando
			System.out.print("Idade: ");
			idade = leia.nextInt();

			if (idade < 0) {
				break; // Aqui o looping acaba se a idade for negativa
			}

			if (idade < 21) { //Aqui é verificado as pessoas com idade menor que 21
				menor21++;
			} else if (idade > 50) { //Aqui é verificado as pessoas com idade maior que 50
				maior50++;
			}
		}

		System.out.println("Total de pessoas com menos de 21 anos: " + menor21);
		System.out.println("Total de pessoas com mais de 50 anos: " + maior50);

		leia.close();
	}

}
