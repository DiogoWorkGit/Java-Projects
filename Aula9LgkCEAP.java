//Fa�a um programa que pe�a a altura e largura e calcule a �rea de um ret�ngulo


import javax.swing.*;
public class Aula9LgkCEAP {
	public static void main(String[] args) {
		
		int altura, largura, area;
		
		altura = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a altura do ret�ngulo?"));
		largura = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a largura do ret�ngulo?"));
		
		area = (altura*largura);
		
		JOptionPane.showMessageDialog(null, "A �rea do ret�ngulo � de aproximadamente: " +area+ "cm^2");
	}
}
