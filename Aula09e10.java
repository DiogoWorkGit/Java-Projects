import javax.swing.JOptionPane;

public class Aula09e10 {

	public static void main (String args[]) {
		
		String txt = JOptionPane.showInputDialog(null, "Digite a frase/palavra a ser analisada");
		
		int qntd = qntd (txt);
		int nv = vowel (txt);
		int nc = consoant (txt);
		String revertido = reverse(txt);
		
		System.out.println("A frase/palavra analisada foi: "+ txt +".\nA quantidade de vogais no texto �: "+nv+"; e a quantidade de consoantes � de: "+nc+".\nA quantidade de letras � de: "+qntd+".\nO texto invertido �: "+revertido+".");
	}
	
	public static int qntd (String txt) { //M�todo Calcular o n�mero de caract�res
		
		int qntd = txt.length();
		
		return qntd;
		
	}
	
	public static int vowel (String txt) { //M�todo Calcular a quantidade de vogais na vari�vel.
		int nv = 0; 
		
		for (int i = 0; i < txt.length(); i++) { // calcular o n�mero de vogais e de consoantes
			char xtx = txt.charAt(i);
			if (xtx == 'a' ||xtx == 'e'||xtx == 'i'||xtx == 'o'||xtx == 'u'){
				nv++;
			} else {}
		
		}
		return nv;
		
	}
	
	public static int consoant (String txt) { //M�todo Calcular a quantidade de consoantes no texto.
		int nc = 0; 
		
		for (int i = 0; i < txt.length(); i++) { // calcular o n�mero de vogais e de consoantes
			char xtx = txt.charAt(i);
			if (xtx == 'a' ||xtx == 'e'||xtx == 'i'||xtx == 'o'||xtx == 'u'){
				
			} else {
				nc++;
			}
		
		}
		return nc;
	}
	
	public static String reverse (String txt) { //M�todo Inverter uma String
		
		String revertido = new StringBuilder(txt).reverse().toString();
		
		return revertido;
	}
}