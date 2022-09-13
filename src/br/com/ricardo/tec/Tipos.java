package br.com.ricardo.tec;
public class Tipos {

	public static void main(String[] args) {

		// variáveis para números inteiros.
		byte tamanhoMinimoByte = Byte.MIN_VALUE; // 2^8
		byte tamanhoMaximoByte = Byte.MAX_VALUE;
		short tamanhoMinimoShort = Short.MIN_VALUE; // 2^16
		short tamanhoShort = Short.MAX_VALUE;
		int tamanhoMinimoInt = Integer.MIN_VALUE; // 2^32
		int tamanhoInt = Integer.MAX_VALUE;
		long tamanhoMinimoLong = Long.MIN_VALUE; // 2^64
		long tamanhoLong = Long.MAX_VALUE;

		// Números de ponto flutuante
		float tamanhoMinimoFloat = Float.MIN_VALUE;
		float tamanhoMaximoFloat = Float.MAX_VALUE;
		double tamanhoMinimoDouble = Double.MIN_VALUE;
		double tamanhoMaximoDouble = Double.MAX_VALUE;

		boolean verdadeiro = true; // ou falso se não for iniciado false é o valor padrão.

		char caractere = 'a';

		String texto = "Este aqui recebe textos";

		System.out.println("***************   INTEIROS ****************");
		System.out.println("O byte cabe até: " + tamanhoMinimoByte + "até" + tamanhoMaximoByte);
		System.out.println("O short cabe até " + tamanhoMinimoShort + "até" + tamanhoShort);
		System.out.println("O int cabe até " + tamanhoMinimoInt + "até" + tamanhoInt);
		System.out.println("O long cabe até " + tamanhoMinimoLong + "até" + tamanhoLong);

		System.out.println("*************   REAIS   *************");
		System.out.println("O Float cabe até " + tamanhoMinimoFloat + "até" + tamanhoMaximoFloat);
		System.out.println("O Double cabe até " + tamanhoMinimoDouble + "até" + tamanhoMaximoDouble);
	}
}
