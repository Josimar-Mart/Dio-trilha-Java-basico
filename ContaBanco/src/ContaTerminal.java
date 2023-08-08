import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o numero da conta !: ");
        numero = sc.nextInt();

        System.out.println("Agora, digite o numero Agencia: ");
        agencia = sc.next();

        System.out.println("Agora, digite o nome do cliente: ");
        sc.useDelimiter("\n");
        nomeCliente = sc.next();
        

        System.out.println("E por último, digite o valor do saldo: ");
        saldo = sc.nextDouble();
        sc.close();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta numero: "
         + numero + ", e seu saldo do valor de: " + saldo + ", já está disponível para saque");

    }
}
