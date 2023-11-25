import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Por favor, digite o número da Agência e tecle enter:");
       String agencia = sc.next();
       System.out.println("Agora, digite o número da conta sem o dígito e tecle enter:");
       int numero = sc.nextInt();
       System.out.println("Agora, digite o número do digito da conta e tecle enter:");
       int numeroDigito = sc.nextInt();
       System.out.println("Digite seu primeiro nome e tecle enter:");
       String nomeCliente = sc.next();
       System.out.println("Digite seu nome sobrenome e tecle enter:");
       String sobreNome = sc.next();
       System.out.println("Digite o valor inicial que deseja depositar e tecle enter:");
       Double saldo = sc.nextDouble();
       
       System.out.printf("Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d-%d e seu saldo R$ %.2f já está disponível para saque.", nomeCliente, sobreNome, agencia, numero, numeroDigito, saldo);
    }
}
