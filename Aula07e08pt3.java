import javax.swing.JOptionPane;

public class Aula07e08pt3 {
	
    public static void main(String args[]) {
        
		String txt = JOptionPane.showInputDialog(null, "Digite uma frase abaixo.");
		
		vowelconsoant (txt);
		
    }
    
    public static void vowelconsoant (String txt){
        
    	int nv = 0, nc = 0;
    	
        for (int i = 0; i < txt.length(); i++) { // calcular o n�mero de vogais e de consoantes
		
		char xtx = txt.charAt(i);
		
		
		if (xtx == 'a' ||xtx == 'e'||xtx == 'i'||xtx == 'o'||xtx == 'u'){
		
			nv++;
		    
		} else {
		    
			nc++;
		
		}
		
        }
		
        System.out.println("A frase/palavra dita foi: "+ txt);
        
        System.out.println("O n�mero de vogais �:" + nv);
        
        System.out.println("O n�mero de consoantes: " + nc);
        
    }
}