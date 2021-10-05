//Faça um programa que peça o nome do aluno, turma, nota da prova, nota do trabalho , calcule a média e como reposta diga o nome do aluno, turma e a média.


import javax.swing.*;
public class Aula9LgkCEAPpt2 {
	public static void main(String[] args) {
		
		String nome, turma;
		int prova, trabalho, media;
		
		nome = JOptionPane.showInputDialog(null,"Qual o nome do aluno?");
		turma = JOptionPane.showInputDialog(null,"Qual o turma do aluno?");
		prova = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual foi a nota da prova?"));
		trabalho = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual foi a nota do trabalho?"));
		
		media = (prova + trabalho)/2;
		
		JOptionPane.showMessageDialog(null, "O aluno " +nome+ " da turma " +turma+ " obteve uma media de " +media);
		
		
	}
}
