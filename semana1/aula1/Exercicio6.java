import java.util.Scanner;

public class Exercicio6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nome, time, bairro;

        System.out.print("Qual o seu nome: ");
        nome = input.nextLine();
        System.out.print("Qual o seu time: ");
        time = input.nextLine();
        System.out.print("Qual o seu bairro: ");
        bairro = input.nextLine();

        System.out.println("Seu nome: " + nome);
        System.out.println("Seu time: " + time);
        System.out.println("Seu bairro: " + bairro);
        input.close();
    }
}