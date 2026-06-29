public class Main {
    public static void main(String[] args){
        System.out.println("Olá, Mundo!");

        apresentacao(args);
        pergunta(args);
    }

    public static void apresentacao(String[] args){
        String nome = "Beatriz";
        int idade = 17;

        System.out.printf("%nOlá, meu nome é %s e tenho %d anos.%n", nome, idade);
    }

    public static void pergunta(String[] args){
        System.out.println("Tudo bem com você?");
    } 
}