package br.com.fatec.Aula3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = 0;
		int valor2 = 7;
		
		for(int i = 0; i <= 7; i++) {
			
			int soma = valor1 + valor2;
			System.out.println(valor1 + " + " + valor2 + " = " + soma);
			
			valor1 += 1;
			valor2 -= 1;
			
		}
	
	}

}
