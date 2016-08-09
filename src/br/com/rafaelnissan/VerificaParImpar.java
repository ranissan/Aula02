package br.com.rafaelnissan;

import java.util.Scanner;

public class VerificaParImpar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
								
		System.out.println("Digite seu salario:  ");
		int valor = entrada.nextInt();
		
		if (valor % 2 == 0){
			System.out.println("Valor é par");
		}
		
}
}
