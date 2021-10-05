import javax.swing.*;
public class Aula19LgkCEAP {
	public static void main (String[] args) {
		
		int m; 
		String b = "";
		
		
		int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Olá, quer fazer um sorteio da 1.Megasena / 2. Lotofácil / 3.Quina?"));
		
		if (n == 1) { //Megasena
			for(int i = 1; i <= 6; i++) {
				m =(int) (Math.random()*60);
				b += m;
			}
		System.out.println(b);
		
		} else if (n == 2) { // Lotofácil
			for(int i =
					
					1; i <= 15; i++) {
				m =(int) (Math.random()*25);
				b += m;
			}
		System.out.println(b);
		
		} else if (n == 3) { // Quina
			for(int i = 1; i <= 5; i++) {
				m =(int) (Math.random()*80);
				b += m;
			}
		System.out.println(b);
		}
	}
}
