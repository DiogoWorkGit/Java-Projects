import javax.swing.*;
public class Aula11LgkCEAPpt5 {
	public static void main(String args[]){
		
		float nota1, nota2, nota3, media;
		int frequencia;
		
		nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual foi a sua nota na primeira prova?"));
		nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual foi a sua nota na segunda prova?"));
		nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual foi a sua nota na terceira prova?"));
		frequencia = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas aulas você participou (100 aulas foram dadas)"));
		
		media = (nota1 + nota2 + nota3)/3;
		
		if (media <= 4 || frequencia < 75) {
			JOptionPane.showMessageDialog(null, "Você foi reprovado!");
		} else if (media > 4 && media < 6 && frequencia >= 75) {
			JOptionPane.showMessageDialog(null, "Você está em recuperação, se esforçe!");
		} else if (media >= 6 && frequencia >= 75) {
			JOptionPane.showMessageDialog(null, "Você passou!");
		}
	}
}
