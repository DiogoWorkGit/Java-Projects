import javax.swing.*;
public class AulaLgk16CEAPpt2 {
	public static void main (String[] args) {
		
		int xy, zy, xx, maior, menor;
		
		xy = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 1� n�mero"));
		zy = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 2� n�mero"));
		xx = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 3� n�mero"));
				
		maior = Math.max(xx, xy);
		menor = Math.min(xx, xy);
		
		System.out.println("De todos os valores: "+Math.max(maior, zy)+" � o maior");
		System.out.println("De todos os valores: "+Math.min(menor, zy)+" � o menor");
		
	}
}
