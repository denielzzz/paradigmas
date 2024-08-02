public class Exercicio1
{
    public static void main(String[] args)
    {
        Contador a = new Contador(1); 
        Contador b = new Contador();

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.getCont());
        System.out.println(b.getCont());
        a.setCont(12);
        System.out.println(a.getCont());
        a.incrementaCont();
        System.out.println(a.getCont());
        a.decrementaCont();
        System.out.println(a.getCont());
        a.zeraCont();
        System.out.println(a.getCont());
    }
}

/*
 * 1 - Classe For
 * 2 - Classe While
 * 3 - Classe Acelerometro
 * 4 - Classe Dedos
 * 5 - Classe Relogio
 */