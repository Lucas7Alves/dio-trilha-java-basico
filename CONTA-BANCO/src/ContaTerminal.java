import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta !");
        int numeroAgnecia = sc.nextInt();

        sc.nextLine();
        System.out.println("Por favor, digite o número da agência !");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome !");
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta !");
        double saldo = sc.nextDouble();

        String msg = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroAgnecia
                + " e seu saldo " + saldo + " já está disponível para saque";

        System.out.println(msg);

    }
}
