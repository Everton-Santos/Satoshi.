package br.com.fatec.Satoshi;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.hibernate.loader.custom.ScalarResultColumnProcessor;

public class Exercicio5 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		
		System.out.print("Valor por hora: ");
		double valorPorHora = sc.nextDouble();
		
		System.out.print("Percentual de desconto (ex: 15%): ");
		double percentualDesconto = (sc.nextDouble() / 100);
		
		System.out.print("Números de descendentes: ");
		int descendentes = sc.nextInt();
		
		double salario = horasTrabalhadas * valorPorHora;
		double salarioLiquido = salario - (salario * percentualDesconto);
		salarioLiquido += ( descendentes * 100);

		System.out.println("Salário: " + salarioLiquido);
		

	}

}
