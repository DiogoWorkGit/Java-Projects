//Aproveitem o exercício do IMC já feito e classifique o imc do usuário em : menor que 18 – abaixo do peso,entre 18 e 25 – peso normal , maior que 25 – Acima do peso.


import javax.swing.*;
public class Aula10LgkCEAP {
	public static void main(String[] args) {
		
		String nome;
		int nascimento, ano, idade;
		float peso, altura, imc;
		
		nome = JOptionPane.showInputDialog(null, "Qual o seu nome?");
		nascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Quando foi que você nasceu?"));
		ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Em qual ano estamos agora?"));
		peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual a sua massa muscular atualmente?"));
		altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Qual a sua altura atualmente"));
		imc = (peso / (altura*altura));
		idade = ano - nascimento;
		JOptionPane.showMessageDialog(null, "Oi, seu nome é " +nome+ " e você tem " +idade+ " anos de idade");
		if (imc <= 18) {
			JOptionPane.showMessageDialog(null, "Seu IMC é abaixo de 18, isso significa que você se encontra abaixo do peso ");
		} else if(imc > 18 && imc < 25){
			JOptionPane.showMessageDialog(null, "Seu IMC está entre 18 e 25, isso significa que você se encontra no seu peso ideal.");
		} else {
			JOptionPane.showMessageDialog(null, "Seu IMC está acima de 25, isso significa que você se encontra acima do peso ");
		}
		
		
	}
}
