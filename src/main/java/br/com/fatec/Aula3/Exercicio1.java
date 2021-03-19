package br.com.fatec.Aula3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		for(int i = 10; i <= 150; i++) {
			int res = (int) Math.pow(i, 2);
			System.out.println("Quadrado de " + i + " = " + res);
		}

	}

}
