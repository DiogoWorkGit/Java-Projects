
import java.util.Scanner;
public class Aula8LgkCEAPpt3 {
	public static void main(String[] args) {
		
		int fh, celsious;
		
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Qual a temperatura atual?(em Fahrenheit):");
		fh = entry.nextInt();
		
		celsious = (int) ((fh - 32)/1.8);

		System.out.println("Ol� a temperatura nesse exato momemento � de: " +celsious+ "�C");
		
		
	}
}
