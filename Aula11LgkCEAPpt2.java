import javax.swing.*;
public class Aula11LgkCEAPpt2 {
	public static void main(String args[]){
		
		int n1, resto;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero a ser verificado"));
		
		resto = n1 % 2;
		
		if(resto == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero foi verificado como par");
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero foi verificado como impar");
		}
		
	}
}
