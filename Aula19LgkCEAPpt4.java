import javax.swing.JOptionPane;

public class Aula19LgkCEAPpt4 {
	public static void main (String[] args) {
		
		int quant, numero = 0;
		
		String txt = JOptionPane.showInputDialog(null, "Digite a frase a ser digitada.");
		
		System.out.println("A frase digitada foi: "+txt);
		
		quant = txt.length();
		
		for (int i = 0; i < txt.length(); i++) { // calcular o número de vogais e de consoantes
			char xtx = txt.charAt(i);
			if (xtx == '1'||xtx == '2'||xtx == '3'||xtx == '4'||xtx == '5'||xtx == '6'||xtx == '7'||xtx == '8'||xtx == '9'||xtx == '0'){
				numero++;
			}
		}
		System.out.println("A quantidade de caractéres foi de: "+quant);
		System.out.println("A quantidade de números digitados dentro da frase foi de: "+numero);
	}
}
