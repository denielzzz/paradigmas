import java.util.Scanner;

public class Exercicio5 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if(x >= 0 && x < 5)
            System.out.println(x);
        else
        if(x >= 5 && x < 10)
            System.out.println(2*x+1);
        else
            System.out.println(x-3);
        input.close();
    }    
}
    