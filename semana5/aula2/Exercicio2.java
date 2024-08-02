public class Exercicio2
{
    public static interface CartaoWeb
    {
        public abstract String retornarMensagem(String remetente);
    }

    public static class CartaoDiaDosNamorados implements CartaoWeb
    {
        private String destinatario;

        public CartaoDiaDosNamorados(String destinatario)
        {
            this.destinatario = destinatario;
        }
        
        public String retornarMensagem(String remetente)
        {
            return String.format("feliz dia dos namorados " + remetente);
        }

    }

    public static class CartaoNatal implements CartaoWeb
    {
        private String destinatario;

        public CartaoNatal(String destinatario)
        {
            this.destinatario = destinatario;
        }

        public String retornarMensagem(String remetente)
        {
            return String.format("feliz natal " + remetente);
        }
    }

    public static class CartaoAniversario implements CartaoWeb
    {
        private String destinatario;

        public CartaoAniversario(String destinatario)
        {
            this.destinatario = destinatario;
        }

        public String retornarMensagem(String remetente)
        {
            return String.format("feliz aniversario " + remetente);
        }
    }

    public static void main(String[] args)
    {
        CartaoDiaDosNamorados cartao1 = new CartaoDiaDosNamorados("dani");
        CartaoNatal cartao2 = new CartaoNatal("piove");
        CartaoAniversario cartao3 = new CartaoAniversario("caio");

        System.out.println(cartao1.retornarMensagem(cartao1.destinatario));
        System.out.println(cartao2.retornarMensagem(cartao2.destinatario));
        System.out.println(cartao3.retornarMensagem(cartao3.destinatario));
    }
}