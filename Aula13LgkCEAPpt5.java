
public class Aula13LgkCEAPpt5 {
	public static void main(String[] args) {
		int i = 1,nm;
		
		for(int n = 1; n <= 10; n++) {
			nm=i*n;
			System.out.println(i+"x"+n+"="+nm);
			if (nm == i*10) {
				i=i+1;
				n=1;
				if (i == 11) {
					break;
				}
			}
		}
		
	}
}
