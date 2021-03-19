package br.com.fatec.Aula2;

import java.util.Locale;
import java.util.Scanner;



public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int resultado;
		
		System.out.print("Valor 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Valor 2: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			resultado = num1 - num2;
			System.out.print( num1 + " - " + num2 + " = " + resultado);
		}
		else {
			resultado = num2 - num1;
			System.out.print( num2 + " - " + num1 + " = " + resultado);
		}
	
	}

}
