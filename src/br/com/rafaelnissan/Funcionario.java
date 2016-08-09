package br.com.rafaelnissan;

import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		
	String nome;
    double salario;
	String area;
	double bonus = 1.1;
	
	Scanner entrada = new Scanner(System.in);
	
    System.out.println("Digite seu nome: ");
    nome = entrada.nextLine();
    
    System.out.println("Digite seu salario:  ");
	salario = Double.parseDouble(entrada.nextLine()); 
  	
	System.out.println("Digite sua Area: ");
	area = entrada.nextLine();  
	 
	 if (area.equals("TI")){
		 salario *= bonus; 
		 //System.out.println(nome + " seu novo salario é: "+ salario);
		 
	 }
	 System.out.println(nome + " seu novo salario é: "+ salario);
	  
    
	}




}
