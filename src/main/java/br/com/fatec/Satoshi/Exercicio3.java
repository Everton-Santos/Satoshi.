package br.com.fatec.Satoshi;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor x:"));
		double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor y:"));
		
		double z = x;
		x = y;
		y = z;
		
		JOptionPane.showMessageDialog(null, "x = " + x + " | y = " + y);
	}

}
