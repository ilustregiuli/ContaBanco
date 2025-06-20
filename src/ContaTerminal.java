import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print( "Por favor, digite o Numero da Agencia: ");
        String agencia = sc.next();

        System.out.print("Por favor, digite o Numero da Conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print( "Por favor, digite o Nome do Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite o Saldo da Conta: ");
        double saldo = sc.nextDouble();
        sc.nextLine();


        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, " +
                        "sua agencia e %s, conta %d e seu saldo %.2f ja esta disponivel para saque",
                        nomeCliente, agencia, numero, saldo);

        sc.close();

    }
}
