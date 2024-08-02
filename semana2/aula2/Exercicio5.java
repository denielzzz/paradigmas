import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        int palavras = frase.split(" ").length;
        System.out.println("A frase tem " + palavras + " palavras!");
        scanner.close();
    }
}