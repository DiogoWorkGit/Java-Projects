import javax.swing.*;
public class AulaLgk16CEAP {
	public static void main (String[] args) {
		
		int n, m; 
		String b = "";
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Olá, digite o número que representará o número de digitos da senha (Ex: 8)"));
		
		for(int i = 1; i <= n; i++) {
			m =(int) (Math.random()*10);
			System.out.println(m);
			b += m;
		}
		System.out.println(b);
	}
}
