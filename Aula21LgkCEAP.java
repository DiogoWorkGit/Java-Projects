
public class Aula21LgkCEAP {
	public static void main (String[] args) {
		
		int numero[] = new int [10];
		int maior = 0, menor = 101, par = 0, impar = 0, PI, soma = 0;
		
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random()*100);
			System.out.println("O n�mero na casa "+(1+i)+" �: "+numero[i]);
		}
		for (int i = 0; i < numero.length; i++) {
			maior = Math.max(maior, numero[i]);
			menor = Math.min(menor, numero[i]);

		}
		System.out.println("O maior n�mero dentro do vetor �: "+maior);
		System.out.println("O menor n�mero dentro do vetor �: "+menor);
		
		for (int i = 0; i < numero.length; i++) {
			PI = numero[i] % 2;
			if (PI == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("A quantidade de n�meros �mpares �: "+impar);
		System.out.println("A quantidade de n�meros pares �: "+par);
		
		for (int i = 0; i < numero.length; i++) {
			soma = soma + numero[i];
		}
		System.out.println("A soma de todos os n�meros dos vetores � de: "+soma);
	}
}
