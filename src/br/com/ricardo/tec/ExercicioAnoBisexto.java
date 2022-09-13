package br.com.ricardo.tec;

import java.util.Scanner;

//Escrever se um ano informado pelo usuário é bissexto ou não. 
//Um ano é bissexto quando é (divisível por 400) ou é (divisível por 4 e não por 100).

public class ExercicioAnoBisexto {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano para validar se é bissexto: ");
		int ano = sc.nextInt();
		// Condiçao para ser considerado ano bissexto				
		boolean condicao = ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
		
		if(condicao) {
			System.out.println("O ano " + ano + "é bissexto!");
		} else {
			System.out.println("O ano" + ano + "não é bissexto!");
		}
		sc.close();
		}	
	}


