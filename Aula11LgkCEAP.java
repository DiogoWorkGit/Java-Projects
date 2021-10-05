import javax.swing.*;
public class Aula11LgkCEAP {
	public static void main(String args[]){
		int cor1, cor2;
		
		cor1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a cor que você deseja pegar como a primeira (Amarelo = 1, Vermelho = 2, Blue = 3)?"));
		cor2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual a cor que você deseja misturar com a anterior (Amarelo = 1, Vermelho = 2, Blue = 3)?"));

		if(cor1 == 1 && cor2 == 1){ //Amarelo com Amarelo
			JOptionPane.showMessageDialog(null, "A cor resultante da sua mistura foi Amarelo");
		} else if(cor1 == 2 && cor2 == 2){ //Vermelho com Vermelho
			JOptionPane.showMessageDialog(null, "A cor resultante da sua mistura foi Vermelho");
		} else if(cor1 == 3 && cor2 == 3){ //Azul com Azul
			JOptionPane.showMessageDialog(null, "A cor resultante da sua mistura foi Azul");
		} else if(cor1 == 1 &&  cor2 == 2){ //Amarelo com Vermelho
			JOptionPane.showMessageDialog(null, "A cor resultante da sua mistura foi Laranja");
		} else if(cor1 == 3 &&  cor2 == 1){ //Azul com Amarelo
			JOptionPane.showMessageDialog(null, "A cor resultante da sua mistura foi Verde");
		} else if(cor1 == 2 &&  cor2 == 3){ //Vermelho com Azul
			JOptionPane.showMessageDialog(null, "A cor resultante da sua mistura foi Violeta");
		} else if(cor1 == 2 &&  cor2 == 1){ //Amarelo com Vermelho
			JOptionPane.showMessageDialog(null, "A cor resultante da sua mistura foi Laranja");
		} else if(cor1 == 1 &&  cor2 == 3){ //Azul com Amarelo
			JOptionPane.showMessageDialog(null, "A cor resultante da sua mistura foi Verde");
		} else if(cor1 == 3 &&  cor2 == 2){ //Vermelho com Azul
			JOptionPane.showMessageDialog(null, "A cor resultante da sua mistura foi Violeta");
		}
		
	}
}
