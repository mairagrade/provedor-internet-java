import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // 1- Imprima a informação do assistente 
        String provedor = "Iceberg";
        System.out.printf("Olá, bem-vindo a central de atendimento %s", provedor );   

        // 2- Imprima a informção do assistente  
        String atendente = "Bia";
        System.out.printf("\nMeu nome é %s, sou seu assistente virtual", atendente);

        // 3- Imprima a informação das instruções 
        System.out.printf("\nDurante o atendimento siga minhas instruções");
        
        // 4- Leia o nome da pessoa
        System.out.print("\nPrimeiramente informe seu nome ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();


        System.out.printf("\nObrigado %s, como posso lhe ajudar? \n ", nome );
        String resposta = scanner.nextLine();
        

        // Imprimindo texto concatenado 
        System.out.println("Sua resposta foi: " + resposta );
        
        scanner.close();
        

        
    }

}
