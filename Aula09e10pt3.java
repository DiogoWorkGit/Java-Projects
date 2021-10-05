import javax.swing.JOptionPane;
public class Aula09e10pt3 {
    
    public static void main(String args[]) {

        System.out.println("Faça um programa que tenha um método que retorne todos os números entre 2 números. Exemplo de 1 a 5 somar 2 , 3 e 4.");
      
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o menor número"));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o maior número"));
        
        int soma = sumbetweentwonumbers (x, y);
        
        System.out.println(soma);
    }

    public static int sumbetweentwonumbers (int x, int y){ //Método Calcular todos os números entre um intervalo.
        
        int sum = 0;
        
        do {
            
            sum = x + sum;
            x++;
            
        } while (x <= y);
        
        return sum;
    }
}