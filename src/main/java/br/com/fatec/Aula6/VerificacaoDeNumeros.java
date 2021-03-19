package br.com.fatec.Aula6;

import java.util.Locale;
import java.util.Scanner;

public class VerificacaoDeNumeros {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor1 = sc.nextInt();
		
		System.out.print("Digite um segundo valor: ");
		int valor2 = sc.nextInt();
		
		System.out.println("A somatória é: " + somatoria(valor1, valor2));
		
		

	}
	
	public static int somatoria(int valor1, int valor2) {
		int soma = 0;
		if(valor1 > valor2) {
			for(int i = valor2; i <= valor1; i++) {
				if(i % 2 != 0) {
					System.out.println("Números ímpares: " + i);
					soma += i;
				}
			}
			return soma;
		}
		else {
			for(int i = valor1; i <= valor2; i++) {
				if(i % 2 != 0) {
					System.out.println("Números ímpares: " + i);
					soma += i;
				}
			}
			return soma;
		}
		
	}

}
