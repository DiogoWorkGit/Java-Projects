import javax.swing.*;
public class Aula14LgkCEAPpt2 {
	public static void main (String[] args) {
		int i, n = 0, y;
		do {
			i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero a ser somado"));
			n = n+i;
		} while (n <= 100);
	}
}
