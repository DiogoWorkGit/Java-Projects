//Fa�a um programa que pe�a para o usu�rio digitar 3 n�meros e como resposta diga qual � o maior n�mero, o menor n�mero e o n�mero do meio.

import javax.swing.*;
public class Aula10LgkCEAPpt2 {
	public static void main(String[] args) {
		
		int number1, number2, number3;
		
		number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o primeiro n�mero?"));
		number2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o segundo n�mero?"));
		number3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o terceiro n�mero?"));
		
		if(number1 > number2 && number2 > number3) { //number1 - number2 - number3
			JOptionPane.showMessageDialog(null, number1+ " � o maior " +number2+ " � o do meio e " +number3+ " � o menor");
		} else if (number3 > number1 && number1 > number2) { //number3 - number1- number2
			JOptionPane.showMessageDialog(null, number3+ " � o maior " +number1+ " � o do meio e " +number2+ " � o menor");
		} else if (number2 > number3 && number3 > number1) { //number2 - number3 - number1
			JOptionPane.showMessageDialog(null, number2+ " � o maior " +number3+ " � o do meio e " +number1+ " � o menor");
		} else if (number1 > number3 && number3 > number2) { //number1 - number3 - number2
			JOptionPane.showMessageDialog(null, number1+ " � o maior " +number3+ " � o do meio e " +number2+ " � o menor");
		} else if (number2 > number1 && number1 > number3) { //number2 - number1 - number3
			JOptionPane.showMessageDialog(null, number2+ " � o maior " +number1+ " � o do meio e " +number3+ " � o menor");
		} else if (number3 > number2 && number2 > number1) { //number3 - number2 - number1
			JOptionPane.showMessageDialog(null, number3+ " � o maior " +number2+ " � o do meio e " +number1+ " � o menor");
		}
	}
}

