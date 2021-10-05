import javax.swing.JOptionPane;


public class Aula11e12 {

	public static void main (String args[]) {
		
		JOptionPane.showMessageDialog(null, "Olá, hoje jogaremos um jogo da forca com o tema de animais\nAs regras são simples, você tem o número de tentativas igual o dobro do tamanho da palavra, ou seja, se você sortear uma palavra com 5 letras, você terá 10 chances para acertar todas as letras.\n'Portanto é hora do dueloooooooo'.");
		String letro = "";
		String palavra = sortear(letro);
		System.out.println(palavra);
		int qntd = palavra.length();
		int chances = qntd*2;
		System.out.println("Bem, vamos começar, já sorteamos a palavra, essa palavra tem um total de "+qntd+" caractéres, portanto você tem um total de "+chances+".\n Boa sorte.");
		do{
			String x = JOptionPane.showInputDialog(null, "Digite uma frase abaixo.");
			boolean ponto = verificador(x, palavra);
			if (x.equals(palavra)) {
				System.out.println("MINHA NOSSA NOSSA NOSSA, VOCÊ ACERTOU DE PRIMEIRA MEU AMIGO, VOCÊ TEM UMA SORTE GIGANTE VIU, CREMDEUSPAI, VAI JOGAR NA LOTERIA.");
				chances = 0;
			} else if (x == null){
				System.out.println("Não aceitamos valor null");
				chances = 0;
			} else {
				if (ponto == true) {
					System.out.println("Acertou, letra: "+x);
					chances--;
				} else {
					System.out.println("Você infelizmente errou, tente outra letra.");
					chances--;
					System.out.println("Total de chances restantes: "+chances);
				}
			}
		} while(chances > 0);
		
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
	
	public static boolean verificador (String x, String y) {
		boolean ponto = false;
		
		for (int i = 0; i < y.length(); i++) { // verificar se tem a letra
			char xx = x.charAt(0);
			char xtx = y.charAt(i);
			System.out.println(xtx);
			if (xtx == xx) {
				ponto = true;
			}else {
				ponto = false;
			}
		}
		return ponto;
	}
}
