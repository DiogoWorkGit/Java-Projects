import javax.swing.*;
public class Aula12LgkCEAPpt2 {
	public static void main (String[] args) {
		
		int pontuação = 0, pergunta1, pergunta2, pergunta3, pergunta4, pergunta5;
		
		pergunta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Resolva a seguinte equação 2+2*4=? 1) 12 / 2) 16 / 3) 10 / 4) 8 (Digite o número da alternativa)"));
		switch (pergunta1) {
		case 1:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		case 2:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		case 3:JOptionPane.showMessageDialog(null, "Você acertou, será somado a sua pontuação +1 ponto");pontuação = pontuação + 1; break;
		case 4:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		}
		pergunta2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é a lingua mais falada no mundo? 1) Alemão / 2) Inglês / 3) Espanhol / 4) Português (Digite o número da alternativa)"));
		switch (pergunta2) {
		case 1:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		case 2:JOptionPane.showMessageDialog(null, "Você acertou, será somado a sua pontuação +1 ponto");pontuação = pontuação + 1; break;
		case 3:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		case 4:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		}
		pergunta3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a forma que nos aplicamos a uma vaga de trabalho? 1) Telefonemas / 2) Cartas / 3) Verbalmente / 4) Currículo (Digite o número da alternativa)\""));
		switch (pergunta3) {
		case 1:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		case 2:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		case 3:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		case 4:JOptionPane.showMessageDialog(null, "Você acertou, será somado a sua pontuação +1 ponto");pontuação = pontuação + 1; break;
		}
		pergunta4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual é o elemento mais presente no nosso corpo? 1) Hidrogênio / 2) Nitrogênio / 3) Carbono / 4) Ferro (Digite o número da alternativa)\""));
		switch (pergunta4) {
		case 1:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		case 2:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		case 3:JOptionPane.showMessageDialog(null, "Você acertou, será somado a sua pontuação +1 ponto");pontuação = pontuação + 1; break;
		case 4:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		}
		pergunta5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Esse quiz foi facil? 1) Sim / 2) Não / 3) Negativo / 4) Talvez (Digite o número da alternativa)\""));
		switch (pergunta5) {
		case 1:JOptionPane.showMessageDialog(null, "Você acertou, será somado a sua pontuação +1 ponto");pontuação = pontuação + 1; break;
		case 2:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		case 3:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		case 4:JOptionPane.showMessageDialog(null, "Você errou, tente somente durante o programa"); break;
		}
		JOptionPane.showMessageDialog(null,"Olá você teve um total de acertos de: "+pontuação);
	}
}
