package br.com.fatec.Satoshi;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os coeficiente!");
		System.out.print("Coeficiente A: ");
		int a = sc.nextInt();
		
		System.out.print("Coeficiente B: ");
		int b = sc.nextInt();
		
		System.out.print("Coeficiente C: ");
		int c = sc.nextInt();
	
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		double x1 = (-b + Math.sqrt(delta)) / 2 * a;
		double x2 = (-b - Math.sqrt(delta)) / 2 * a;
		
		System.out.println("Raiz 1 = " + x1);
		System.out.println("Raiz 2 = " + x2);

	}

}
