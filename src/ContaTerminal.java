import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        int numero = sc.nextInt();

       System.out.println("Por favor, digite o número da Agência !");
       String agencia = sc.next();


        System.out.println("Por favor, digite o seu Nome!");
        String nome = sc.next();

        sc.nextLine();
        System.out.println("Por favor, digite o seu Saldo inicial !");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo "+ saldo +" já está disponível para saque");

        sc.close();

    }
}
