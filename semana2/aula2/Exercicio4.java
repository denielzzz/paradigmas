import java.util.Scanner;

public class Exercicio4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float[][] m1 = new float[30][4];
        float maiorNotaAluno;
        float maiorNotaTurma = 0;
         
        for(int i = 0; i < m1.length; i++)
        {
            for(int j = 0; j < m1[0].length; j++)
            {
                System.out.print("Digite a nota " + (j+1) + " do aluno " + (i+1) + ": ");
                m1[i][j] = scanner.nextFloat();
            }
        }

        for(int i = 0; i < m1.length; i++)
        {
            float nota = 0;
            maiorNotaAluno = 0;
            for(int j = 0; j < m1[0].length; j++)
            {
                nota = m1[i][j];
                if(nota > maiorNotaAluno)
                maiorNotaAluno = nota;
            }
            System.out.println("A maior nota do aluno " + (i+1) + " é: " + maiorNotaAluno);
            if(maiorNotaAluno > maiorNotaTurma)
                maiorNotaTurma = maiorNotaAluno;
        }
        System.out.println("A maior nota da turma é: " + maiorNotaTurma);
        scanner.close();
    }
}