import javax.swing.JOptionPane;

public class Aula02_09pt2 {
	public static void main (String args[]) {
	
		String txt = JOptionPane.showInputDialog(null, "Digite a palavra que ser� analisada.");
		analise(txt);
	
	}
	
	public static void analise (String txt){
		
		char first, last;
		int nv = 0, nc = 0; 
		
		int qntd = txt.length(); //quantidade de caract�res
		
		for (int i = 0; i < txt.length(); i++) { // calcular o n�mero de vogais e de consoantes
			char xtx = txt.charAt(i);
			if (xtx == 'a' ||xtx == 'e'||xtx == 'i'||xtx == 'o'||xtx == 'u'){
				nv++;
			} else {
				nc++;
			}
		}
		
		char tx[] = txt.toCharArray();
		
		System.out.println("O texto escrito foi: "+txt);
		System.out.println("A quantidade de caract�res que temos �: "+qntd);
		System.out.println("O n�mero de vogais �:"+nv);
		System.out.println("O n�mero de consoantes: "+nc);
		System.out.println(tx.reverse());
		
	}
		
	}

}
