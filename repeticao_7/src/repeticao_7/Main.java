package repeticao_7;
import javax.swing.JOptionPane;
public class Main{
	
    public static void main(String[] args) {
        int dia1 = 0, mes1 = 0;
        int dia2 = 0, mes2 = 0;

        // Controle de validação sem boolean (0 = inválido, 1 = válido)
        int valido1 = 0;
        while (valido1 == 0) {
            String inputDia1 = JOptionPane.showInputDialog("Usuário 1 - Digite o dia do seu nascimento (1 a 31):");
            String inputMes1 = JOptionPane.showInputDialog("Usuário 1 - Digite o mês do seu nascimento (1 a 12):");

            if (inputDia1 != null && inputMes1 != null) {
                dia1 = Integer.parseInt(inputDia1);
                mes1 = Integer.parseInt(inputMes1);

                if (dia1 >= 1 && dia1 <= 31 && mes1 >= 1 && mes1 <= 12) {
                    valido1 = 1; 
                } else {
                    JOptionPane.showMessageDialog(null, "Data inválida para o Usuário 1! Tente novamente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }
        }

      
        int valido2 = 0;
        while (valido2 == 0) {
            String inputDia2 = JOptionPane.showInputDialog("Usuário 2 - Digite o dia do seu nascimento (1 a 31):");
            String inputMes2 = JOptionPane.showInputDialog("Usuário 2 - Digite o mês do seu nascimento (1 a 12):");

            if (inputDia2 != null && inputMes2 != null) {
                dia2 = Integer.parseInt(inputDia2);
                mes2 = Integer.parseInt(inputMes2);

                if (dia2 >= 1 && dia2 <= 31 && mes2 >= 1 && mes2 <= 12) {
                    valido2 = 1; 
                } else {
                    JOptionPane.showMessageDialog(null, "Data inválida para o Usuário 2! Tente novamente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                return;
            }
        }

        
        if (mes1 < mes2) {
            JOptionPane.showMessageDialog(null, "O Usuário 1 faz aniversário primeiro!");
        } else if (mes2 < mes1) {
            JOptionPane.showMessageDialog(null, "O Usuário 2 faz aniversário primeiro!");
        } else {
         
            if (dia1 < dia2) {
                JOptionPane.showMessageDialog(null, "O Usuário 1 faz aniversário primeiro!");
            } else if (dia2 < dia1) {
                JOptionPane.showMessageDialog(null, "O Usuário 2 faz aniversário primeiro!");
            } else {
                JOptionPane.showMessageDialog(null, "Ambos fazem aniversário no mesmo dia!");
            }
        }
    }
}