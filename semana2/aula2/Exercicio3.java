import java.util.Scanner;

public class Exercicio3
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        float[][] m1, m2;
        
        m1 = new float[3][3];
        m2 = new float[3][3];

        for(int i = 0; i < m1[0].length; i++)
        {
            for(int j = 0; j < m1[0].length; j++)
            {
                System.out.print("Digite o valor da matriz 1 na posição [" + i + "][" + j + "]: ");
                m1[i][j] = scanner.nextFloat();
            }
        }

        for(int i = 0; i < m2.length; i++)
        {
            for(int j = 0; j < m2[0].length; j++)
            {
                System.out.print("Digite o valor da matriz 2 na posição [" + i + "][" + j + "]: ");
                m2[i][j] = scanner.nextFloat();
            }
        }

        System.out.println("A soma das matrizes é :");

        for(int i = 0; i < m1.length; i++)
        {
            for(int j = 0; j < m1[0].length; j++)
            {
                System.out.print((m1[i][j] + m2[i][j]) + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}