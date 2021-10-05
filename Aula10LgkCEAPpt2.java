//Faça um programa que peça para o usuário digitar 3 números e como resposta diga qual é o maior número, o menor número e o número do meio.

import javax.swing.*;
public class Aula10LgkCEAPpt2 {
	public static void main(String[] args) {
		
		int number1, number2, number3;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o primeiro número?"));
		number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o segundo número?"));
		number3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o terceiro número?"));
		
		if(number1 > number2 && number2 > number3) { //number1 - number2 - number3
			JOptionPane.showMessageDialog(null, number1+ " é o maior " +number2+ " é o do meio e " +number3+ " é o menor");
		} else if (number3 > number1 && number1 > number2) { //number3 - number1- number2
			JOptionPane.showMessageDialog(null, number3+ " é o maior " +number1+ " é o do meio e " +number2+ " é o menor");
		} else if (number2 > number3 && number3 > number1) { //number2 - number3 - number1
			JOptionPane.showMessageDialog(null, number2+ " é o maior " +number3+ " é o do meio e " +number1+ " é o menor");
		} else if (number1 > number3 && number3 > number2) { //number1 - number3 - number2
			JOptionPane.showMessageDialog(null, number1+ " é o maior " +number3+ " é o do meio e " +number2+ " é o menor");
		} else if (number2 > number1 && number1 > number3) { //number2 - number1 - number3
			JOptionPane.showMessageDialog(null, number2+ " é o maior " +number1+ " é o do meio e " +number3+ " é o menor");
		} else if (number3 > number2 && number2 > number1) { //number3 - number2 - number1
			JOptionPane.showMessageDialog(null, number3+ " é o maior " +number2+ " é o do meio e " +number1+ " é o menor");
		}
	}
}

