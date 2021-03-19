package br.com.fatec.Satoshi;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: "));
		int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		
		int idade = anoAtual - anoNascimento;
		int idadeFuturo = idade + 17;
		
		JOptionPane.showMessageDialog(null, "Idade: " + idade + " | idade + 17 anos = " + idadeFuturo);

	}

}
