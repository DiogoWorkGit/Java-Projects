import javax.swing.JOptionPane;

// Fa�a um programa que sorteie 1 n�mero de 0 a 10 e o usu�rio ter� 3 tentativas para acertar qual � esse n�mero.


public class AulaLgk16CEAPpt3 {
	public static void main (String[] args) {
		
		int i = 0, n;
		int r = (int) (Math.random()*10);
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o n�mero sorteado?"));
			if (n == r) {
				JOptionPane.showMessageDialog(null, "Voc� acertou.");
				i = 3;
			}
			JOptionPane.showMessageDialog(null, "Voc� Errou.");
			i++;
			if (i == 3) {
				JOptionPane.showMessageDialog(null, "Voc� perdeu.");
			}
		} while (i < 3);
		
	}
}
