import javax.swing.JOptionPane;

public class Aula02_09pt2 {
	public static void main (String args[]) {
	
		String txt = JOptionPane.showInputDialog(null, "Digite a palavra que será analisada.");
		analise(txt);
	
	}
	
	public static void analise (String txt){
		
		char first, last;
		int nv = 0, nc = 0; 
		
		int qntd = txt.length(); //quantidade de caractéres
		
		for (int i = 0; i < txt.length(); i++) { // calcular o número de vogais e de consoantes
			char xtx = txt.charAt(i);
			if (xtx == 'a' ||xtx == 'e'||xtx == 'i'||xtx == 'o'||xtx == 'u'){
				nv++;
			} else {
				nc++;
			}
		}
		
		char tx[] = txt.toCharArray();
		
		System.out.println("O texto escrito foi: "+txt);
		System.out.println("A quantidade de caractéres que temos é: "+qntd);
		System.out.println("O número de vogais é:"+nv);
		System.out.println("O número de consoantes: "+nc);
		System.out.println(tx.reverse());
		
	}
		
	}

}
