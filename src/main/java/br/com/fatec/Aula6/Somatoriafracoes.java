package br.com.fatec.Aula6;

import java.util.Locale;
import java.util.Scanner;

public class Somatoriafracoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int n = sc.nextInt();
		
		Somatoriafracoes fracoes = new Somatoriafracoes();
		System.out.println(fracoes.calculaConta(n));
	
	}
	
	public static String calculaConta(int n) {
		double soma = 0;
		
		for(double cont = 1; cont <= n; cont++) {
			soma += (1 / cont);
		}
		return String.format("%.2f", soma);
	
	}

}
