package Aula12.Interface;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

public class PetShop {

        public void menu(){


            int opcao= 1;
            do {
                String aux = "";
                aux += "[1] Cadastrar animal\n";
                aux += "[2] Registrar serviço\n";
                aux += "[3] Calcular conta total\n";
                aux += "[4] Exibir relatório\n";
                aux += "[5] Finalizar\n";
                    try {
                        opcao = parseInt(showInputDialog(aux));
                    }catch (NumberFormatException e){
                        showMessageDialog(null, "Irrou Pae, a opção deve ser um número inteiro entre 1 e 5. " );
                    }

            } while (opcao != 5);
        }
    }

