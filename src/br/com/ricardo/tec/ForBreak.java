package br.com.ricardo.tec;
public class ForBreak {

	public static void main(String[] args) {
		// TODO Este código é de responsabilidade do Ravi
	int x = 1;
	
	int y = 90;
	
	int numeroAVerificar = 5;
	
	for(int i = x; i < y; i++) {
		if(i % numeroAVerificar == 0) {
			System.out.println("Achei um número (entre x e y) que é divisível por " + numeroAVerificar + ": " + i);
			break; //Interrompe o laço de repetição
		}
		}
	}
	}


