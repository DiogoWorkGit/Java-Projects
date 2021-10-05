
public class AulaLgk16CEAPpt4 {
	public static void main (String[] args) {
		
		int n = 0, na=0, no=0, nm=0;
		
		for(int i=0; i<3; i++) {
			n=(int) (Math.random()*100);
			System.out.println(n);
			if (i == 0) {
				na = n;
			}
			if (i == 1) {
				if(n > na) {
					na = n;
				}else {
					no = n;
				}
			if (i == 2) {
				if (n > na && n > nm) {
					na = n;
				}else if (n > nm) {
					nm = n;
				}
			}
			}
		}
		System.out.println("Maior: "+na+" Menor: "+no+" Meio:" +nm);
		
	}
}
