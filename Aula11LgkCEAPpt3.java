import javax.swing.*;
public class Aula11LgkCEAPpt3 {
	public static void main(String args[]){
		
		int mesada, price, dif;
		
		mesada = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto voc� ganha de mesada"));
		price = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto custa o produto que voc� quer?"));
		
		dif = price - mesada;
		
		if(mesada >= price) {
			JOptionPane.showMessageDialog(null, "Voc� j� pode comprar este produto.");
		} else if (mesada < price) {
			JOptionPane.showMessageDialog(null, "Voc� ainda n�o tem dinheiro o suficiente para conseguir comprar esse produto, lhe faltam: " +dif);
		}
	}
}
