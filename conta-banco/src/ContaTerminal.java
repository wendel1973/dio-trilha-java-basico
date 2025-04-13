import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner

        //exibir as mensagens para nosso usuário

        //Obter pla Scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 0.00d;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.println("Por favor digite o número da conta.");
        numero = scanner.nextInt();
        System.out.println("Por favor digite a agência.");
        agencia = scanner.next();
        System.out.println("Por favor digite seu nome.");
        nomeCliente = scanner.next();
        System.out.println("Por favor digite seu saldo.");
        saldo = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+" conta "+ numero+" seu saldo é "+ (float)saldo);
        
    }
}
