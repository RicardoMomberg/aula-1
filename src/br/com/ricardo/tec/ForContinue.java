package br.com.ricardo.tec;

public class ForContinue {
	/**
	 * O código acima não vai imprimir alguns números. (Quais exatamente?)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			if(i > 50 && i < 60) {
				continue;
			}
			System.out.println(i);
		}
	}
}
