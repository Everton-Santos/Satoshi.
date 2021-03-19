package br.com.fatec.Satoshi;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tempo de Percurso: ");
		int tempoPercurso = sc.nextInt();
		
		System.out.print("Velocidade Média: ");
		int velocidadeMedia = sc.nextInt();
		
		double distancia = tempoPercurso * velocidadeMedia;
		
		double litrosGastos = distancia / 12;
		
		System.out.println("Litros gastos = " + String.format("%.2f", litrosGastos));

	}

}
