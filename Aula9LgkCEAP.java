//Faça um programa que peça a altura e largura e calcule a área de um retângulo


import javax.swing.*;
public class Aula9LgkCEAP {
	public static void main(String[] args) {
		
		int altura, largura, area;
		
		altura = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a altura do retângulo?"));
		largura = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a largura do retângulo?"));
		
		area = (altura*largura);
		
		JOptionPane.showMessageDialog(null, "A área do retângulo é de aproximadamente: " +area+ "cm^2");
	}
}
