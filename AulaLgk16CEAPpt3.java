import javax.swing.JOptionPane;

// Faça um programa que sorteie 1 número de 0 a 10 e o usuário terá 3 tentativas para acertar qual é esse número.


public class AulaLgk16CEAPpt3 {
	public static void main (String[] args) {
		
		int i = 0, n;
		int r = (int) (Math.random()*10);
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o número sorteado?"));
			if (n == r) {
				JOptionPane.showMessageDialog(null, "Você acertou.");
				i = 3;
			}
			JOptionPane.showMessageDialog(null, "Você Errou.");
			i++;
			if (i == 3) {
				JOptionPane.showMessageDialog(null, "Você perdeu.");
			}
		} while (i < 3);
		
	}
}
