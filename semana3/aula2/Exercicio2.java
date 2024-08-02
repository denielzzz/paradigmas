import java.util.Scanner;

public class Exercicio2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Time h1, h2;
        int h, m;

        System.out.print("Digite uma hora: ");
        h = scanner.nextInt();
        System.out.print("Digite um minuto: ");
        m = scanner.nextInt();
        h1 = new Time(h, m);

        System.out.print("Digite uma hora: ");
        h = scanner.nextInt();
        System.out.print("Digite um minuto: ");
        m = scanner.nextInt();
        h2 = new Time(h, m);

        System.out.println(h1.toString());
        System.out.println(h2.toString());

        if(h1.anterior(h2.hora, h2.minuto))
            System.out.println(h1.toString() + " é anterior a " + h2.toString());
        else
        if(h1.posterior(h2.hora, h2.minuto))
            System.out.println(h1.toString() + " é posterior a " + h2.toString());
        else
        System.out.println(h1.toString() + " e " + h2.toString() + " são iguais");

        scanner.close();
    }
}