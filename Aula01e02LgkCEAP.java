
public class Aula01e02LgkCEAP {
	public static void main (String[] args) {
		
		for (int i = 0; i < 5; i++) {
			
			int n = (int) (Math.random()*5);
			
			int r = n+1;
		
			switch (r) {
			case 1: System.out.println("A"); break;
			case 2: System.out.println("B"); break;
			case 3: System.out.println("C"); break;
			case 4: System.out.println("D"); break;
			case 5: System.out.println("E"); break;
			
			}
		}	
	}
}
