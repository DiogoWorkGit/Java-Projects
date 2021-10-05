/*Uma bala custa $0,15 a unidade, e se forem compradas mais de 10 unidades o preço cai para $0,10, façam
um programa que peça a quantidade de balas e diga quanto o usuário deve pagar, em seguida digite o valor
recebido e se necessário mostre o valor do troco (simulação de caixa de mercado)*/

import javax.swing.*;
public class Aula10LgkCEAPpt4 {
	public static void main (String args[]) {
		
		double pedido, bala;
		
		pedido = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantas balas você deseja?"));
		
		if (pedido < 10) {
			bala = pedido * 0.15;
			JOptionPane.showMessageDialog(null, "o preço das " +pedido+ " balas vai custar " +bala+ " reais");
		} else {
			bala = pedido * 0.10;
			JOptionPane.showMessageDialog(null, "o preço das " +pedido+ " balas vai custar " +bala+ " reais");
		}
		
	}
}
