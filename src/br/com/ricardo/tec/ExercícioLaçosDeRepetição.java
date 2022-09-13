package br.com.ricardo.tec;
//Crie um programa java que leia a velocidade de um carro e a velocidade máxima para a via:
//1. Informe 50 reais se estiver até 10km/h acima;
//2. informe 100 reais se estiver entre 11km/h e 30km/h acima;
//3. Informe 300 reais se estiver acima de 31km/h acima.


import java.util.Scanner;

public class ExercícioLaçosDeRepetição {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe velocidade do veículo: ");
		int velocidadeDoVeiculo = sc.nextInt();
		
		System.out.println("Informe a velocidade máxima da via: ");
		int velocidadeMaxima = sc.nextInt();
		
		double multa = 0;
		
		int velocidade = velocidadeDoVeiculo - velocidadeMaxima;
		
		if(velocidade > 31) {
			multa = 300;
			System.out.println(multa);
		} else if(velocidade >= 11) {
			multa = 100;
			System.out.println(multa);
		} else if(velocidade > 0) {
			multa = 50;
			System.out.println(multa);
		} else {
			System.out.println("Parabéns por respeitar as leis de trânsito!");
		}
		sc.close();
	}
}
