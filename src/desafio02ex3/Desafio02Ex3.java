package desafio02ex3;

import javax.swing.JOptionPane;

public class Desafio02Ex3 {
    public static void main(String[] args) {
        /* Faça um algoritmo que some duas variáveis e mostre a resposta */
        
        double x, y, r;
        
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para X:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para Y:"));
        r = x + y;
            JOptionPane.showMessageDialog(null, "A soma total das variáveis foi de: "+r);
    }
    
}
