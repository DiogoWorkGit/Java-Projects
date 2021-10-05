
import java.util.Scanner;
public class Aula8LgkCEAPpt2 {
	public static void main(String[] args) {
		
		String nome;
		float prova1, prova2, prova3, media;
		
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Qual o seu nome?:");
		nome = entry.nextLine();
		
		System.out.println("Qual foi a nota da sua primeira prova?:");
		prova1 = entry.nextFloat();

		System.out.println("Qual foi a nota da sua segunda prova?:");
		prova2 = entry.nextFloat();

		System.out.println("Qual foi a nota da sua terceira prova?:");
		prova3 = entry.nextFloat();

		media =  (prova1+prova2+prova3)/3;
		
		
		System.out.println("Olá " +nome+ " sua média final foi de " +media);
		
		
	}
}
