import javax.swing.*;
public class AulaLgk16CEAPpt2 {
	public static void main (String[] args) {
		
		int xy, zy, xx, maior, menor;
		
		xy = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 1° número"));
		zy = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 2° número"));
		xx = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o 3° número"));
				
		maior = Math.max(xx, xy);
		menor = Math.min(xx, xy);
		
		System.out.println("De todos os valores: "+Math.max(maior, zy)+" é o maior");
		System.out.println("De todos os valores: "+Math.min(menor, zy)+" é o menor");
		
	}
}
