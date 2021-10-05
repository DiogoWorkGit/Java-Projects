
public class Aula21LgkCEAP {
	public static void main (String[] args) {
		
		int numero[] = new int [10];
		int maior = 0, menor = 101, par = 0, impar = 0, PI, soma = 0;
		
		for (int i = 0; i < numero.length; i++) {
			numero[i] = (int) (Math.random()*100);
			System.out.println("O número na casa "+(1+i)+" é: "+numero[i]);
		}
		for (int i = 0; i < numero.length; i++) {
			maior = Math.max(maior, numero[i]);
			menor = Math.min(menor, numero[i]);

		}
		System.out.println("O maior número dentro do vetor é: "+maior);
		System.out.println("O menor número dentro do vetor é: "+menor);
		
		for (int i = 0; i < numero.length; i++) {
			PI = numero[i] % 2;
			if (PI == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("A quantidade de números ímpares é: "+impar);
		System.out.println("A quantidade de números pares é: "+par);
		
		for (int i = 0; i < numero.length; i++) {
			soma = soma + numero[i];
		}
		System.out.println("A soma de todos os números dos vetores é de: "+soma);
	}
}
