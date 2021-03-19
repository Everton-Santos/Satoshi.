package br.com.fatec.Satoshi;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva a temperatura em Graus Celsius: ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (9 * celsius + 160) / 5;
		
		System.out.println("A temperatura convertida em Fahrenheit é: " + fahrenheit + "F");

	}

}
