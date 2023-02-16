package atv1;

import javax.swing.JOptionPane; //classe para a criação de uma caixa de diálogo.

public class AtvTabuadaopc2{

    public static void main(String[] args){

        String r = "";
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um numero: ", "NUMERO",1));
        int o = Integer.parseInt(JOptionPane.showInputDialog(null,"1- '+'\n 2- '-'\n 3- '*'\n 4- '/' \n","OPERAÇÃO",1));

        for(int c=-1;c<11;c++){
            switch(o){
                case 1:
                    r+= n + "+" + c + "=" + (n+c) + "\n"; //'+=' diz que 'r' recebe o valor dele somado ao próximo valor
                    break;
                case 2:
                    r+= (n+c) + "-" + n + "=" + c + "\n";
                    break;
                case 3:
                    r+= n + "*" + c + "=" + (n*c) + "\n";
                    break;
                case 4:
                    r+= (n*c) + "/" + n + "=" + c + "\n";
                    break;
            }
        }
        JOptionPane.showMessageDialog(null,r,"TABUADA",1);
    }
}