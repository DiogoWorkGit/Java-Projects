import javax.swing.JOptionPane;
public class Aula02_09 {

	public static void main (String args[]) {
		
		int f1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número que será comparados"));
		int f2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número que será comparados"));
		int f3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número que será comparados"));
		
		compare(f1, f2, f3);
		
	}	
	public static void compare(int f1, int f2, int f3){
		
		int maior = Math.max(f1, f2);
		int menor = Math.min(f1, f2);
		
		System.out.println("De todos os valores: "+Math.max(maior, f3)+" é o maior");
		System.out.println("De todos os valores: "+Math.min(menor, f3)+" é o menor");
		
	}
	
}
