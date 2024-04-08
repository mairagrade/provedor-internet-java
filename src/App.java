import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String provedor = "Iceberg";
        System.out.printf("Olá, bem-vindo a central de atendimento %s", provedor );   


        String atendente = "Bia";
     
        System.out.printf("\nMeu nome é %s, sou seu assistente virtual", atendente);


        System.out.printf("\nDurante o atendimento siga minhas instruções");
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nPrimeiramente informe seu nome ");
        String nome = scanner.next();


        System.out.printf("\nObrigado %s, como posso lhe ajudar?", nome );

        
        scanner.close();

        
    }

}
