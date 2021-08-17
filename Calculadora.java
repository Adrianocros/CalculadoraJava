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
            processar(opcao);
        }while(opcao != 0);
    }

    public static void processar(int opcao){
        switch(opcao) {
            case 1: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Somar dois numeros");

                System.out.print("Digite o primeiro numero: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo numero: ");
                int numero2 = scanner.nextInt();

                int resultado = numero1 + numero2;
                System.out.println("O resultado da soma é: " + resultado);

                break;
            }
            case 2:{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Subtrair dois numeros");

                System.out.print("Digite o primeiro numero: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo numero: ");
                int numero2 = scanner.nextInt();

                int resultado = numero1 - numero2;
                System.out.println("O resultado da subtração é: " + resultado);

                break;
            }
            case 3: {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Multiplicar dois numeros");

                System.out.print("Digite o primeiro numero: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo numero: ");
                int numero2 = scanner.nextInt();

                int resultado = numero1 * numero2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            }
            case 4:
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Dividir dois numeros");

                System.out.print("Digite o primeiro numero: ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo numero: ");
                int numero2 = scanner.nextInt();

                int resultado = numero1 / numero2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            }
        }
    }
}
