package contabanco;

import java.util.Scanner;

/**
 *
 * @author adriano silva Belisio
 * @E-mail adriano.belisio@gmail.com
 */
public class ContaBanco {

    public static void main(String[] args) {
        Scanner inputTeclado = new Scanner(System.in);

        long conta;
        String agencia, nomeCliente;
        double saldo = 237.48;

        System.out.printf("""
                Ola, seja bem-vindo ao Banco Java!
                Por favor, digite seus dados da sua conta bancaria.\n
                """);
        System.out.println("*".repeat(60));
        System.out.print("Digite o seu nome: ");
        nomeCliente = inputTeclado.nextLine();
        System.out.print("Digite o numero da conta: ");
        conta = inputTeclado.nextLong();
        System.out.print("Digite o numero da Agencia: ");
        agencia = inputTeclado.next();

        System.out.print("Ola " + nomeCliente);
        System.out.print(", obrigado por criar uma conta em nosso banco, sua agencia eh: " + agencia + " \n");
        System.out.print("e seu saldo eh de: R$ " + saldo + ", ja esta disponivel para saque.");
        System.out.println("\n");

    }

}
