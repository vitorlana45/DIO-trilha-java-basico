import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        StringBuilder sb = new StringBuilder();

       
        System.out.print("Digite o numero da conta: ");
        int numeroConta = sc.nextInt(); 
        System.out.print("Digite a Agencia: ");
        String agencia = sc.next();
        sc.nextLine();
        System.out.print("Digite seu nome: ");
        String nomeCliente = sc.nextLine();
        Double saldo = 237.48;
       
        System.out.println(); 
        sb.append("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso nosso Banco. \n");
        sb.append("sua AGENCIA: " + agencia + " Conta: " + numeroConta + " e seu SALDO: " + saldo + " já está disponivel para saque.");
      
       System.out.println(sb);

       sc.close();
    }
}
