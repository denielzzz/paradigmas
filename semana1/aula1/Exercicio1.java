import java.util.Scanner;

public class Exercicio1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.print("Digite um número: ");
        number = input.nextInt();
        if(number > 0)
            System.out.println(number + " é positivo!");

        input.close();
    }
    
}