import javax.swing.*;
public class Aula11LgkCEAPpt4 {
	public static void main(String args[]){
		
		int time1, time2;
		
		time1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos gols o Time 1 j� fez"));
		time2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos gols o Time 2 j� fez"));
		
		if (time1 > time2) { // Time 1 est� ganhando
			JOptionPane.showMessageDialog(null, "O Time 1 Est� ganhando!");
		} else if (time1 == time2) { // Ambos os times est�o empatados
			JOptionPane.showMessageDialog(null, "Ambos os times est�o empatados.");
		} else if (time1 < time2) { // Time 2 est� ganhando
			JOptionPane.showMessageDialog(null, "O Time 2 Est� ganhando!");
		}
	}
}
