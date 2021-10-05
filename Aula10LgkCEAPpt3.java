//Faça um programa que peça nome de usuário e senha para um usuário e caso a senha e o usuário estejam corretos retorne “acesso permitido” , senão diga “acesso negado”. (usuário: 1sit senha java).

import javax.swing.*;

public class Aula10LgkCEAPpt3 {
	public static void main(String[] args) {
		
		String usuario, senha;
		
		usuario = JOptionPane.showInputDialog(null, "Qual o seu usuário?");
		senha = JOptionPane.showInputDialog(null, "Qual a sua senha?");
		
		if (usuario.equals("1sit") && senha.equals("java")) {
				JOptionPane.showMessageDialog(null, "Acesso Permitido");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso Negado");
		}
		
	}
}
