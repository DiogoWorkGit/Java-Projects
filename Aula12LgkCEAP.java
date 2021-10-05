import javax.swing.*;
public class Aula12LgkCEAP {
	public static void main (String[] args) {
		
		String semana;
		
		semana = JOptionPane.showInputDialog(null, "Em que dia da semana nós estamos?");
		
		switch (semana) {
		case "segunda": JOptionPane.showMessageDialog(null, "O número da semana é: 1"); break;
		case "terça": JOptionPane.showMessageDialog(null, "O número da semana é: 2"); break;
		case "quarta": JOptionPane.showMessageDialog(null, "O número da semana é: 3"); break;
		case "quinta": JOptionPane.showMessageDialog(null, "O número da semana é: 4"); break;
		case "sexta": JOptionPane.showMessageDialog(null, "O número da semana é: 5"); break;
		case "sábado": JOptionPane.showMessageDialog(null, "O número da semana é: 6"); break;
		case "domingo": JOptionPane.showMessageDialog(null, "O número da semana é: 7"); break;
		
		default: JOptionPane.showMessageDialog(null, "Não foi possível indetificar qual o número desse dia da semana");
		}
		
	}
}
