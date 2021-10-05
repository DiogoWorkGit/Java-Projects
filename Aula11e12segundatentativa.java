import javax.swing.JOptionPane;

public class Aula11e12segundatentativa {

	public static void main (String args[]) {
		
		JOptionPane.showMessageDialog(null, "Olá, hoje jogaremos um jogo da forca com o tema de animais\nAs regras são simples, você tem o número de tentativas igual o dobro do tamanho da palavra, ou seja, se você sortear uma palavra com 5 letras, você terá 10 chances para acertar todas as letras.\n'Portanto é hora do dueloooooooo'.");
		String letro = "";
		String palavra = sortear(letro);
		System.out.println(palavra);
		int qntd = palavra.length();
		int chances = qntd*2;
		int rpoints = 0;
		System.out.println("Bem, vamos começar, já sorteamos a palavra, essa palavra tem um total de "+qntd+" caractéres, portanto você tem um total de "+chances+".\n Boa sorte.");

		do {
			String x = JOptionPane.showInputDialog(null, "Digite uma letra abaixo.");
			System.out.println("Você digitou a letra: "+x);
			rpoints = vverificador(x, palavra, rpoints);
			
			if (x == null){
				System.out.println("Não aceitamos valor null");
				chances = 0;

			} else {
			    
				if (rpoints == qntd) {
					System.out.println("VOCE GANHOU");
				}
			}
		} while (chances > 0 || rpoints == qntd);

	}

	public static String sortear (String txt) {
		String[] xtx = new String[16];
		xtx[0] = "elefante";
		xtx[1] = "girafa";
		xtx[2] = "peixe";
		xtx[3] = "galinha";
		xtx[4] = "cachorro";
		xtx[5] = "gato";
		xtx[6] = "esquilo";
		xtx[7] = "coelho";
		xtx[8] = "cavalo";
		xtx[9] = "puma";
		xtx[10] = "leao";
		xtx[11] = "leopardo";
		xtx[12] = "mocergo";
		xtx[13] = "golfinho";
		xtx[14] = "hipopotamo";
		xtx[15] = "macaco";
		
		int n = (int) (Math.random()*15);
		String texto = xtx[n];
		return texto;
		
	}
	
	public static int vverificador (String x, String y, int z) {
		int points = z;
		char xx = x.charAt(0);
		
		for (int i = 0; i < y.length(); i++) { // verificar se tem a letra
			char xtx = y.charAt(i);
		
			if (xtx == xx) {
				points++;
				System.out.println("Você marcou um ponto, seu total é: "+points);
			
			} else {
			}
		                                                               
		}
		
		if (points == z) {
		    System.out.println("Infelizmente você errou a letra tente outra");
		}
		
		return points; 
		
	}
}