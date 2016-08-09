package br.com.rafaelnissan;

import java.util.Scanner;

public class Menu {
	public final static int CADASTRO_PRODUTO = 1;
	public final static int EMISSAO_NOTA     = 2;
	public final static int CANCELAR_COMPRA  = 3;
	public final static int EFETURA_VENDA    = 4;
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Menu prncipal:");
		System.out.println("1 - cadastro de produtos");
		System.out.println("2 - Emitir Nota fiscal");
		System.out.println("3 - Cancelar Compra");
		System.out.println("4 - Efetuar Venda");
		
		System.out.println("Digite a opção desejada: ");
		
		int opcao = entrada.nextInt();
       
		switch (opcao) {
		case CADASTRO_PRODUTO: 
			System.out.println("cadastro de produtos");
			break;
		case EMISSAO_NOTA: 
			System.out.println("Emitir Nota fiscal");
			break;
		case CANCELAR_COMPRA: 
			System.out.println("Cancelar Compra");
			break;
		case EFETURA_VENDA: 
			System.out.println("Efetuar Venda");
		    break;
        default:
        	System.out.println("Opção Invalida");
        	break;
		}
		
	}
}
