import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, Digite seu nome: ");
		String nomeCliente = sc.nextLine();
		System.out.println("Digite a sua agência");
	    int agencia = sc.nextInt();
        System.out.println("Digite o número da sua conta: ");
	    int numero = sc.nextInt();
        System.out.println("Digite o número da sua conta: ");
	    double saldo = sc.nextDouble();

        System.out.printf("Olá %s obrigado por criar uma conta em nosso banco sua agência é %d conta %d e seu saldo R$%f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
       
        sc.close();
    }
}
