import javax.swing.*;
public class Aula12LgkCEAP {
	public static void main (String[] args) {
		
		String semana;
		
		semana = JOptionPane.showInputDialog(null, "Em que dia da semana n�s estamos?");
		
		switch (semana) {
		case "segunda": JOptionPane.showMessageDialog(null, "O n�mero da semana �: 1"); break;
		case "ter�a": JOptionPane.showMessageDialog(null, "O n�mero da semana �: 2"); break;
		case "quarta": JOptionPane.showMessageDialog(null, "O n�mero da semana �: 3"); break;
		case "quinta": JOptionPane.showMessageDialog(null, "O n�mero da semana �: 4"); break;
		case "sexta": JOptionPane.showMessageDialog(null, "O n�mero da semana �: 5"); break;
		case "s�bado": JOptionPane.showMessageDialog(null, "O n�mero da semana �: 6"); break;
		case "domingo": JOptionPane.showMessageDialog(null, "O n�mero da semana �: 7"); break;
		
		default: JOptionPane.showMessageDialog(null, "N�o foi poss�vel indetificar qual o n�mero desse dia da semana");
		}
		
	}
}
