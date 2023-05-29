import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner in = new Scanner(System.in);
        //Exibir as mensagens para o nosso usuário
        System.out.println("Digite o seu nome: ");
        String nomeCliente = in.nextLine();
        System.out.println("Digite o número da sua conta: ");
        int numero = in.nextInt();
        in.nextLine();
        System.out.println("Digite o número da sua Agência: ");
        String agencia = in.nextLine();
        System.out.println("Digite o seu saldo: ");
        double saldo = in.nextDouble();

        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem de conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é: " +
                agencia + ", conta: " + numero + ", e seu saldo: " + BRLNumberFormat.format(saldo) + ", já está disponível para saque.");
    }
}