/*Uma bala custa $0,15 a unidade, e se forem compradas mais de 10 unidades o pre�o cai para $0,10, fa�am
um programa que pe�a a quantidade de balas e diga quanto o usu�rio deve pagar, em seguida digite o valor
recebido e se necess�rio mostre o valor do troco (simula��o de caixa de mercado)*/

import javax.swing.*;
public class Aula10LgkCEAPpt4 {
	public static void main (String args[]) {
		
		double pedido, bala;
		
		pedido = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantas balas voc� deseja?"));
		
		if (pedido < 10) {
			bala = pedido * 0.15;
			JOptionPane.showMessageDialog(null, "o pre�o das " +pedido+ " balas vai custar " +bala+ " reais");
		} else {
			bala = pedido * 0.10;
			JOptionPane.showMessageDialog(null, "o pre�o das " +pedido+ " balas vai custar " +bala+ " reais");
		}
		
	}
}
