import javax.swing.*;

public class Aula19LgkCEAPpt2 {
	public static void main (String[] args) {
		
		String txt;
		int nv = 0;
		
		txt = JOptionPane.showInputDialog(null, "Digite uma frase abaixo.");
		
		for (int i = 0; i < txt.length(); i++) { // calcular o n�mero de vogais e de consoantes
			char xtx = txt.charAt(i);
			if (xtx == 'a' ||xtx == 'e'||xtx == 'i'||xtx == 'o'||xtx == 'u'){
				nv++;
			}
		}
	System.out.println("O n�mero de voga�s na palavra <" +txt+ "> �: "+nv);
	}
}
