import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Olá, Mundo!");
        apresentacao(args);
        pergunta(args);

        Scanner teclado = new Scanner(System.in);
        String como_estou = teclado.nextLine();
        System.out.println("Você está se sentindo " + como_estou);

        e_bom(args);
        String isso_e = teclado.nextLine();
        System.out.println("Isso é " + isso_e);
        teclado.close();
    }

    public static void apresentacao(String[] args){
        String nome = "Beatriz";
        int idade = 17;

        System.out.printf("%nOlá, meu nome é %s e tenho %d anos.%n", nome, idade);
    }

    public static void pergunta(String[] args){
        System.out.println("Tudo bem com você?");
    } 

    public static void e_bom(String[] args){
        System.out.printf("Isso é bom ou ruim? ");
    }
}