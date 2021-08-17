import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        System.out.println("CALCULADORA SIMPLES");
        int opcao;
        do{
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.print("Digite uma opção acima, 0 para sair: ");

            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();
        }while(opcao != 0);
    }
}
