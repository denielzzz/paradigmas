public class Exercicio1 {
    public static class Celular {
        public String ddi;
        public String ddd;
        public String numero;

        public void cadastrar(String ddi, String ddd, String numero) {
            this.ddi = ddi;
            this.ddd = ddd;
            this.numero = numero;
        }

        public void exibir() {
            System.out.println("O número completo é: +" + this.ddi + "(" + this.ddd + ") " + this.numero);
        }
    }

    public static void main(String[] args) {
        Celular[] numeros = new Celular[5];

        // Inicializando cada objeto Celular no array
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = new Celular();
            numeros[i].cadastrar("55", "41", "99414-1239");
        }

        // Exibindo os dados de cada celular
        for(int i = 0; i < numeros.length; i++) {
            numeros[i].exibir();
        }
    }
}