import java.util.Scanner;

public class Exercicio3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int soma = 0, number = 0;

        System.out.print("Digite -1 para parar, ou qualquer outro número para somar: ");
        number = input.nextInt();
        while(number != -1)
        {
            System.out.print("Digite -1 para parar, ou qualquer outro número para somar: ");
            soma += number;
            number = input.nextInt();
        }
        System.out.println("A soma é: " + soma);

        input.close();
    }    
}
