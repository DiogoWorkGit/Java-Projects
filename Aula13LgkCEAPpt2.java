import javax.swing.*;
public class Aula13LgkCEAPpt2 {
	public static void main(String[] args) {
		
		for(int n=0; n<5; n++ ) {
			int nu;
			nu = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero a ser verificado:"));
			nu = nu % 2;
			if (nu == 0){
				JOptionPane.showMessageDialog(null, "O n�mero inserido � par!");
			} else {
				JOptionPane.showMessageDialog(null, "O n�mero inserido � impar!");
			}
			
		}
		
	}
}
