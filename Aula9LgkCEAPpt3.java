//Fa�a um programa que pe�a a dist�ncia em metros e converta para quil�metros.


import javax.swing.*;
public class Aula9LgkCEAPpt3 {
	public static void main(String[] args) {
		
		double metros, km;
		
		metros = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos metros foram percorridos pelos corredores?"));
		
		km = metros/1000;
		
		JOptionPane.showMessageDialog(null,"A quantidade de kilometros percorridos foi de aproximadamente " +km);
		
	}
}
