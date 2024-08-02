import java.util.Scanner;

public class Exercicio8
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cont = 0, cond;
        float altura, peso;

        System.out.print("Escreva -1 para sair ou qualquer número para continuar: ");
        cond = input.nextInt();
        while(cond != -1)
        {
            System.out.print("Escreva o peso: ");
            peso = input.nextFloat();
            System.out.print("Escreva a altura: ");
            altura = input.nextFloat();
            if(peso/(altura*altura) > 25)
                cont++;
        System.out.print("Escreva -1 para sair ou qualquer número para continuar: ");
        cond = input.nextInt();
            
        }
        System.out.println("Existem " + cont + " pessoas acima do peso!");
    }
}