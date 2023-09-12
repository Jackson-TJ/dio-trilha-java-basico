import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            Scanner nome = new Scanner(System.in);
            Scanner auxiliar = new Scanner(System.in);
            String agenciaNumero;
            int numeroConta;
            String nomeCliente;
            Double saldo;
                  
            System.out.println("Por favor, digite o número da Agência !");
                agenciaNumero = auxiliar.nextLine();

            System.out.println("Por favor, digite o número da Conta !");
                numeroConta = auxiliar.nextInt();
                
            System.out.println("Por favor, digite o seu nome !");            
                nomeCliente = nome.nextLine();

            System.out.println("Por favor, digite o Saldo !");
                saldo = auxiliar.nextDouble();
            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é  " +agenciaNumero+",");
            System.out.println(" conta  "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");
            nome.close();
        auxiliar.close();
    }

    
    
}
