package br.com.fatec.Aula3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int x1 = sc.nextInt();
		
		System.out.print("Digite um valor 2: ");
		int x2 = sc.nextInt();
		
		int soma = 0;
		int maiorValor;
		
		if(x1 > x2) {
			maiorValor = x1;
			
			for(int i = x2; i <= x1; i++) {
				
				if(i % 2 != 0) {
					soma += i;
				}
				
			}
		
		}
		else {
			maiorValor = x2;
			
			for(int i = x1; i <= x2; i++) {
				
				if(i % 2 != 0) {
					soma += i;
				}
				
			}
		}
		
		System.out.println("Maior Valor = " + maiorValor);
		System.out.println("Soma = " + soma);
	}
	

}
