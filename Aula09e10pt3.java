import javax.swing.JOptionPane;
public class Aula09e10pt3 {
    
    public static void main(String args[]) {

        System.out.println("Fa�a um programa que tenha um m�todo que retorne todos os n�meros entre 2 n�meros. Exemplo de 1 a 5 somar 2 , 3 e 4.");
      
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o menor n�mero"));
        int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o maior n�mero"));
        
        int soma = sumbetweentwonumbers (x, y);
        
        System.out.println(soma);
    }

    public static int sumbetweentwonumbers (int x, int y){ //M�todo Calcular todos os n�meros entre um intervalo.
        
        int sum = 0;
        
        do {
            
            sum = x + sum;
            x++;
            
        } while (x <= y);
        
        return sum;
    }
}