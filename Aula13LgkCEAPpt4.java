import javax.swing.*;
public class Aula13LgkCEAPpt4 {
	public static void main(String[] args) {
		int i;
		
		i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número a ser multiplicado:"));
		
		for(int n = 1; n <= 10; n++) {
			int nm;
			nm = n * i;
			System.out.println(i+ "x" +n+ "=" +nm);
			
		}
	}
}
