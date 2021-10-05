import javax.swing.*;
public class Aula19LgkCEAPpt3 {
	public static void main (String[] args) {
		
		int quant;
		int schar = 0, numero = 0;
		
		String password = JOptionPane.showInputDialog(null, "Digite a senha abaixo.");
		
		quant = password.length();
		
		for (int i = 0; i < password.length(); i++) { // calcular o número de vogais e de consoantes
			char xtx = password.charAt(i);
			if (xtx == '1'||xtx == '2'||xtx == '3'||xtx == '4'||xtx == '5'||xtx == '6'||xtx == '7'||xtx == '8'||xtx == '9'||xtx == '0'){
				numero++;
			} else if (xtx == '#'||xtx == '!'||xtx == '@'||xtx == '$'||xtx == '%'||xtx == '*') {
				schar++;
			}
		}
		System.out.println(password + numero + schar + quant);
		
		if (quant >= 8) {
			System.out.println("Primeiro aspecto concluído...");
			if (numero >= 1) {
				System.out.println("Segundo aspecto concluído...");
				if (schar >= 1) {
					System.out.println("Sua senha está comprindo os aspectos necessários do programa.");
				} else {
					System.out.println("Sua senha não está correta nos padrões do programa.");
				}
			} else {
				System.out.println("Sua senha não está correta nos padrões do programa.");
			}
		} else {
			System.out.println("Sua senha não está correta nos padrões do programa.");
		}
	}
}
