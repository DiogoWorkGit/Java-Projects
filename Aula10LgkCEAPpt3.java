//Fa�a um programa que pe�a nome de usu�rio e senha para um usu�rio e caso a senha e o usu�rio estejam corretos retorne �acesso permitido� , sen�o diga �acesso negado�. (usu�rio: 1sit senha java).

import javax.swing.*;

public class Aula10LgkCEAPpt3 {
	public static void main(String[] args) {
		
		String usuario, senha;
		
		usuario = JOptionPane.showInputDialog(null, "Qual o seu usu�rio?");
		senha = JOptionPane.showInputDialog(null, "Qual a sua senha?");
		
		if (usuario.equals("1sit") && senha.equals("java")) {
				JOptionPane.showMessageDialog(null, "Acesso Permitido");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso Negado");
		}
		
	}
}
