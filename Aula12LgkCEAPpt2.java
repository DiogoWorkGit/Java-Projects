import javax.swing.*;
public class Aula12LgkCEAPpt2 {
	public static void main (String[] args) {
		
		int pontua��o = 0, pergunta1, pergunta2, pergunta3, pergunta4, pergunta5;
		
		pergunta1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Resolva a seguinte equa��o 2+2*4=? 1) 12 / 2) 16 / 3) 10 / 4) 8 (Digite o n�mero da alternativa)"));
		switch (pergunta1) {
		case 1:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		case 2:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		case 3:JOptionPane.showMessageDialog(null, "Voc� acertou, ser� somado a sua pontua��o +1 ponto");pontua��o = pontua��o + 1; break;
		case 4:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		}
		pergunta2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual � a lingua mais falada no mundo? 1) Alem�o / 2) Ingl�s / 3) Espanhol / 4) Portugu�s (Digite o n�mero da alternativa)"));
		switch (pergunta2) {
		case 1:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		case 2:JOptionPane.showMessageDialog(null, "Voc� acertou, ser� somado a sua pontua��o +1 ponto");pontua��o = pontua��o + 1; break;
		case 3:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		case 4:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		}
		pergunta3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a forma que nos aplicamos a uma vaga de trabalho? 1) Telefonemas / 2) Cartas / 3) Verbalmente / 4) Curr�culo (Digite o n�mero da alternativa)\""));
		switch (pergunta3) {
		case 1:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		case 2:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		case 3:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		case 4:JOptionPane.showMessageDialog(null, "Voc� acertou, ser� somado a sua pontua��o +1 ponto");pontua��o = pontua��o + 1; break;
		}
		pergunta4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual � o elemento mais presente no nosso corpo? 1) Hidrog�nio / 2) Nitrog�nio / 3) Carbono / 4) Ferro (Digite o n�mero da alternativa)\""));
		switch (pergunta4) {
		case 1:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		case 2:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		case 3:JOptionPane.showMessageDialog(null, "Voc� acertou, ser� somado a sua pontua��o +1 ponto");pontua��o = pontua��o + 1; break;
		case 4:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		}
		pergunta5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Esse quiz foi facil? 1) Sim / 2) N�o / 3) Negativo / 4) Talvez (Digite o n�mero da alternativa)\""));
		switch (pergunta5) {
		case 1:JOptionPane.showMessageDialog(null, "Voc� acertou, ser� somado a sua pontua��o +1 ponto");pontua��o = pontua��o + 1; break;
		case 2:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		case 3:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		case 4:JOptionPane.showMessageDialog(null, "Voc� errou, tente somente durante o programa"); break;
		}
		JOptionPane.showMessageDialog(null,"Ol� voc� teve um total de acertos de: "+pontua��o);
	}
}
