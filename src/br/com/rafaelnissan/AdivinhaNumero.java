package br.com.rafaelnissan;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class AdivinhaNumero {
  public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  
	 String valor = JOptionPane.showInputDialog("Digite um numero a ser adivinhado: ");
	 
	 //System.out.println("Digite um numero a ser adivinhado:");
	 //int chave = entrada.nextInt();
	 
	int chave = Integer.parseInt(valor);
	 
	 
	 int chute = 0;
	 boolean acertou = false;
	 int contador = 0;
	 System.out.println("Digite um numero :");
	 do{
		 
		 chute = entrada.nextInt();
		 contador += 1;
		 if(chute > chave){
			 System.out.println("Digite um numero mais baixo.");
		 } else if(chute < chave){
			 System.out.println("Digite um numero mais alto.");
		 }else {
			 System.out.println("Voce acertou.");
			 }
	 }while(chute != chave);
	 
	 System.out.println("Voce acertou em "+ contador+ " tentativas");
}
}
