package br.com.ricardo.tec;

import java.util.Random;
import java.util.Scanner;

//1. Faça um laço de repetição que solicite ao usuário digitar um número;
//2. O laço encerra quando o usuário acertar o número;
//3. Se o número do usuário for menor que o oculto, escrever: “MAIOR”, se o número do usuário for maior que o oculto, escrever: “MENOR”.
public class ExercicioSorteio {
	
	public static void main(String[] args) {
		
Random r = new Random();
        
        int sorteado = r.nextInt(2);
        // System.out.println(sorteado);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número");

        int numeroEscolhido = scanner.nextInt();

        while (numeroEscolhido != sorteado) {
            System.out.println("Escolha um número");
            numeroEscolhido = scanner.nextInt();
            if (numeroEscolhido > sorteado) {
                System.out.println("Menor");
            } else if (numeroEscolhido < sorteado) {
                System.out.println("Maior");
            } else {
                System.out.println("Igual");
            }
        }
        scanner.close();			
	}
}
