import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int media = 0;
        int[] idade = new int[10];
        
        for(int i = 0; i < idade.length; i++)
        {
            System.out.print("Digite uma idade: ");
            idade[i] = input.nextInt();
            media += idade[i];
        }
        media /= idade.length;
        System.out.println("A idade média é: " + media);
        for(int i = 0; i < idade.length; i++)
        {
            if(idade[i] > media)
                System.out.println("A idade " + idade[i] + " está acima da média!");
            if(idade[i] < media)
                System.out.println("A idade " + idade[i] + " está abaixo da média!");
        }
        input.close();
    }
}