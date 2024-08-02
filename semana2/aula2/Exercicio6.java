import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um nome: ");
        String frase = scanner.nextLine();
        String[] palavras = frase.split(" ");
        System.out.println("O nome formatado é: " + palavras[(palavras.length - 1)] + ", " + palavras[0].charAt(0) + ".");

        scanner.close();
    }
}