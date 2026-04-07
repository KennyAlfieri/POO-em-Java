package Aula08;

//importar todos os metodos dentro da classe static precisa usar "*"
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Interface {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog;
        /*
        showMessageDialog(null, "Receba");
        showInputDialog("bom dia");
        showConfirmDialog(null, "Tem certeza?");

         */

        //Integer.parseInt para converter inteiros

        int valor1,valor2,resultado;
        valor1=parseInt(showInputDialog("Primeiro Valor"));
        valor2=parseInt(showInputDialog("Segundo valor"));
        resultado= valor1+valor2;
        showMessageDialog(null, "Resultado = "+resultado);

    }
}
