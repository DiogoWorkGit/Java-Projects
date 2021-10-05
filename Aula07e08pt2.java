import javax.swing.JOptionPane;

public class Aula07e08pt2 {
    
    public static void main(String args[]) {
        
        double total = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor total da compra."));
        double pago = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o pagamento do cliente"));
        
        processo (total, pago);
      
    }
    
    public static void processo (double x, double y){
        
    // Troco
        
        if (x < y){ // Cliente paga +.
            
            double troco = y - x;
            
            System.out.println("O cliente tem que receber um troco de: " + troco);
            
        } else if (x == y) { // Cliente paga =.
            
            System.out.println("O cliente pagou exatamente o preço da compra, portanto não há troco");
            
        } else if (x > y) { // Cliente paga -.
            
            System.out.println("O cliente pagou menos que o valor total da compra, favor exigir que o cliente pague o valor faltante");
            
        }
        
    }
}