import javax.swing.*;

public class Aula07e08 {

    public static void main(String args[]) {
        
    int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual opera��o voc� vai fazer: 1. Soma / 2. Subtra��o / 3. Multiplica��o / 4. Divis�o / 5. Potencia��o / 6. Raiz Quadrada"));
        
        if (opcao <= 4){
        
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro n�mero"));
            int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo n�mero"));
            
            if (opcao == 1){
                
                sum (x, y);
                
            } else if (opcao == 2){
                
                sub (x, y);
                
            } else if (opcao == 3){
                
                mult (x, y);
                
            } else if (opcao == 4){
                
                div (x, y);
                
            }
            
        } else if (opcao == 5){
            
            double x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero"));
            double y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o potenciador"));
            
            pont (x, y);
            
        } else if (opcao == 6){
            
            double x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o n�mero"));
            
            rad (x);
            
        }
    }
    
    public static void sum (int x, int y){

        int resultado = x + y;
        
        System.out.println("A soma entre esses n�meros �: " + resultado);
        
    }
    
    public static void sub (int x, int y){

        int resultado = x - y;
        
        System.out.println("A subtra��o entre esses n�meros �: " + resultado);
        
    }
    
    public static void mult (int x, int y){

        int resultado = x * y;
        
        System.out.println("A multiplica��o entre esses n�meros �: " + resultado);
        
    }
    
    public static void div (int x, int y){

        int resultado = x / y;
        
        System.out.println("A divis�o entre esses n�meros �: " + resultado);
        
    }
    
    public static void pont (double x, double y){
        
        double resultado = Math.pow(x, y);
        
        System.out.println("A pot�ncia entre esses n�meros �: " + resultado);
        
    }
    
    public static void rad (double x){

        double resultado = Math.sqrt(x);
        
        System.out.println("A raiz do n�mero " + x + " : " + resultado);
        
    }
    
    
}