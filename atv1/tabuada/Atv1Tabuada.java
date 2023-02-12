package atv1.tabuada;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Atv1Tabuada {

    public static void main(String[] args) {

        int c; //Variável de controle
        Scanner obj1 = new Scanner(System.in); //Criar um objeto de scanner
        System.out.println("Informe um  numero: ");
        int n = obj1.nextInt();
        System.out.println("1- '+'\n2- '-'\n3- '*'\n4- '/'");
        System.out.println("Informe a operacao: ");
        var op = obj1.nextInt(); //Lê o input do usuário
        switch(op){
            case 1:
                for(c=-1;c<11;c++){
                    System.out.println(n + "+"+ c +"=" + (c+n));
                }break;
            case 2:
                for(c=-1;c<11;c++){
                    System.out.println(n + "-"+ c +"=" + ((c-n)*-1));
                }break;
            case 3:
                for(c=-1;c<11;c++){
                    System.out.println(n + "*"+ c +"=" + (c*n));
                }break;
            case 4:
                for(c=-1;c<11;c++){ 
                    DecimalFormat frmt = new DecimalFormat("#.##"); // Define que os números decimais devem aparecer com somente duas casas após a vírgula
                    System.out.println(n + "/"+ c +"=" + (frmt.format((double)n/c)));
                }break;
            default:
        }
    }
}