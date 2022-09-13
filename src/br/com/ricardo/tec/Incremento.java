package br.com.ricardo.tec;

public class Incremento {
	
	public static void main(String[] args) {
		
		int i = 5;
		
		//primeiro eu atribuo o valor de i para a variável x e depois eu somo um ao
		// valor de i
		int x = i++;
		
		System.out.println(x);
		
		
		int j = 10;
		
		//Neste caso primeito é somado um ao valor de j para depois ser realizada a
		//passagem de valor para a variável z
		int z = ++j;
		
		System.out.println(z);
		
		
		int k = 100;
		
		int l = k--;
		
		System.out.println(l);
		
		
		int n = 100;
		
		int m = --n;
				
		System.out.println(m);		
	}

}
