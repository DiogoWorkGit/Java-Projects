import javax.swing.JOptionPane;
public class Aula09e10pt2 {

	public static void main (String args[]) {
		
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro n�mero que ser� comparados"));
		int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro n�mero que ser� comparados"));
		int z = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro n�mero que ser� comparados"));
		
		int max = comparemax(x, y, z);
		int min = comparemin(x, y, z);
		
		System.out.println("De todos os valores: "+ max +" � o maior");
		System.out.println("De todos os valores: "+ min +" � o menor");
		
	}	
	public static int comparemax(int f1, int f2, int f3){ //M�todo Achar o maior n�mero entre tr�s. 
		
		int maior = Math.max(f1, f2);
		
		int ma = Math.max(maior, f3);
		
		return ma;
	}
	
	public static int comparemin(int f1, int f2, int f3) { //M�todo Achar o menor n�mero entre tr�s.
		
		int menor = Math.min(f1, f2);
		
		int me = Math.min(menor, f3);
		
		return me;
	}
	
}