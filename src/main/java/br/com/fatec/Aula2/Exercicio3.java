package br.com.fatec.Aula2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salarioFuturo;
		
		System.out.print("Valor Salário: ");
		double salario = sc.nextDouble();
		
		System.out.println("** Escolha um código! **");
		System.out.println("Código 1: ");
		System.out.println("Código 2: ");
		System.out.println("Código 3: ");
		System.out.println("Código 4: ");
		System.out.print("Código: ");
		int codigo = sc.nextInt();
		
		System.out.println();
		switch(codigo) {
		case 1:
			salario += (salario * 50) / 100;
			System.out.println("Bônus Salário: 50%");
			System.out.println("Escrituário | Salário: " + String.format("%.2f", salario));
			break;
		case 2:
			salario += (salario * 35) / 100;
			System.out.println("Bônus Salário: 35%");
			System.out.println("Secretário | Salário: " + String.format("%.2f", salario));
			break;
		case 3:
			salario  += (salario * 20) / 100;
			System.out.println("Bônus Salário: 20%");
			System.out.println("Caixa | Salário: " + String.format("%.2f", salario));
			break;
		case 4:
			salario += (salario * 10) / 100;
			System.out.println("Bônus Salário: 10%");
			System.out.println("Gerente | Salário: " + String.format("%.2f", salario));
			break;
		default:
			System.out.println("Código não encontrado!");
		}
	}

}
