package br.com.fatec.Aula2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("** Digita 3 valores em ordem crescente! **");
		System.out.println("");
		
		System.out.print("Valor 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Valor 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("Valor 3: ");
		int num3 = sc.nextInt();
		
		System.out.print("Digite um valor aleatório: ");
		int num4 = sc.nextInt();
		
		if(num4 < num1) {
			System.out.println("Ordem Crescente: " + num4 + ", " + num1 + ", " + num2 + ", " + num3);
		}
		else if(num4 > num1 && num4 < num2) {
			System.out.println("Ordem Crescente: " + num1 + ", " + num4 + ", " + num2 + ", " + num3);
		}
		else if(num4 > num2 && num4 < num3) {
			System.out.println("Ordem Crescente: " + num1 + ", " + num2 + ", " + num4 + ", " + num3);
		}
		else if(num4 > num3) {
			System.out.println("Ordem Crescente: " + num1 + ", " + num2 + ", " + num3 + ", " + num4);
		}
	}

}
