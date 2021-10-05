import javax.swing.*;

public class Aula07e08 {

    public static void main(String args[]) {
        
    int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual operação você vai fazer: 1. Soma / 2. Subtração / 3. Multiplicação / 4. Divisão / 5. Potenciação / 6. Raiz Quadrada"));
        
        if (opcao <= 4){
        
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número"));
            int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número"));
            
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
            
            double x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número"));
            double y = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o potenciador"));
            
            pont (x, y);
            
        } else if (opcao == 6){
            
            double x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número"));
            
            rad (x);
            
        }
    }
    
    public static void sum (int x, int y){

        int resultado = x + y;
        
        System.out.println("A soma entre esses números é: " + resultado);
        
    }
    
    public static void sub (int x, int y){

        int resultado = x - y;
        
        System.out.println("A subtração entre esses números é: " + resultado);
        
    }
    
    public static void mult (int x, int y){

        int resultado = x * y;
        
        System.out.println("A multiplicação entre esses números é: " + resultado);
        
    }
    
    public static void div (int x, int y){

        int resultado = x / y;
        
        System.out.println("A divisão entre esses números é: " + resultado);
        
    }
    
    public static void pont (double x, double y){
        
        double resultado = Math.pow(x, y);
        
        System.out.println("A potência entre esses números é: " + resultado);
        
    }
    
    public static void rad (double x){

        double resultado = Math.sqrt(x);
        
        System.out.println("A raiz do número " + x + " : " + resultado);
        
    }
    
    
}