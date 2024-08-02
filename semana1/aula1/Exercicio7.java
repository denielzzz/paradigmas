import java.util.Scanner;

public class Exercicio7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n, maiorAluno, maiorTurma = 0; 
        for(int i = 0; i < 40; i++)
        {
            maiorAluno = 0;
            for(int j = 0; j < 4; j++)
            {
                n = input.nextInt();
                if(n > maiorAluno)
                    maiorAluno = n;
            }
            System.out.println("A maior nota do aluno " + (i+1) + " foi " + maiorAluno);
            if(maiorAluno > maiorTurma)
                maiorTurma = maiorAluno;    
        }
        System.out.println("A maior nota da turma foi " + maiorTurma);
        input.close();
    }
}