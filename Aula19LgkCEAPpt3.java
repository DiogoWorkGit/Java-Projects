import javax.swing.*;
public class Aula19LgkCEAPpt3 {
	public static void main (String[] args) {
		
		int quant;
		int schar = 0, numero = 0;
		
		String password = JOptionPane.showInputDialog(null, "Digite a senha abaixo.");
		
		quant = password.length();
		
		for (int i = 0; i < password.length(); i++) { // calcular o n�mero de vogais e de consoantes
			char xtx = password.charAt(i);
			if (xtx == '1'||xtx == '2'||xtx == '3'||xtx == '4'||xtx == '5'||xtx == '6'||xtx == '7'||xtx == '8'||xtx == '9'||xtx == '0'){
				numero++;
			} else if (xtx == '#'||xtx == '!'||xtx == '@'||xtx == '$'||xtx == '%'||xtx == '*') {
				schar++;
			}
		}
		System.out.println(password + numero + schar + quant);
		
		if (quant >= 8) {
			System.out.println("Primeiro aspecto conclu�do...");
			if (numero >= 1) {
				System.out.println("Segundo aspecto conclu�do...");
				if (schar >= 1) {
					System.out.println("Sua senha est� comprindo os aspectos necess�rios do programa.");
				} else {
					System.out.println("Sua senha n�o est� correta nos padr�es do programa.");
				}
			} else {
				System.out.println("Sua senha n�o est� correta nos padr�es do programa.");
			}
		} else {
			System.out.println("Sua senha n�o est� correta nos padr�es do programa.");
		}
	}
}
