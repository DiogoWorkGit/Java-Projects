import javax.swing.*;
public class Aula13LgkCEAPpt6 {
	public static void main (String[] args) {
		int b, c, nm;
		
		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero a ser multiplicado:"));
		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero com o qual o primeiro n�mero vai ser multiplicado:"));

		for(int n = 1; n <= c; n++) {
			nm = b * n;
			System.out.println(b+"*"+n+"="+nm);
		}
	}
}
