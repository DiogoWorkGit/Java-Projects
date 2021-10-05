import javax.swing.*;
public class Aula11LgkCEAPpt3 {
	public static void main(String args[]){
		
		int mesada, price, dif;
		
		mesada = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto você ganha de mesada"));
		price = Integer.parseInt(JOptionPane.showInputDialog(null, "Quanto custa o produto que você quer?"));
		
		dif = price - mesada;
		
		if(mesada >= price) {
			JOptionPane.showMessageDialog(null, "Você já pode comprar este produto.");
		} else if (mesada < price) {
			JOptionPane.showMessageDialog(null, "Você ainda não tem dinheiro o suficiente para conseguir comprar esse produto, lhe faltam: " +dif);
		}
	}
}
