import javax.swing.*;
public class Aula11LgkCEAPpt4 {
	public static void main(String args[]){
		
		int time1, time2;
		
		time1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos gols o Time 1 já fez"));
		time2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos gols o Time 2 já fez"));
		
		if (time1 > time2) { // Time 1 está ganhando
			JOptionPane.showMessageDialog(null, "O Time 1 Está ganhando!");
		} else if (time1 == time2) { // Ambos os times estão empatados
			JOptionPane.showMessageDialog(null, "Ambos os times estão empatados.");
		} else if (time1 < time2) { // Time 2 está ganhando
			JOptionPane.showMessageDialog(null, "O Time 2 Está ganhando!");
		}
	}
}
