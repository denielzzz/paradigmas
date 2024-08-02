public class Exercicio1
{
    public abstract static class CartaoWeb
    {
        protected String destinatario;

        public abstract String retornarMensagem(String remetente);
    }

    public static class CartaoDiaDosNamorados extends CartaoWeb
    {
        public CartaoDiaDosNamorados(String destinatario)
        {
            this.destinatario = destinatario;
        }
        
        public String retornarMensagem(String remetente)
        {
            return String.format("feliz dia dos namorados " + remetente);
        }

    }

    public static class CartaoNatal extends CartaoWeb
    {
        public CartaoNatal(String destinatario)
        {
            this.destinatario = destinatario;
        }

        public String retornarMensagem(String remetente)
        {
            return String.format("feliz natal " + remetente);
        }
    }

    public static class CartaoAniversario extends CartaoWeb
    {
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
        CartaoWeb[] cartoes = new CartaoWeb[3];

        cartoes[0] = new CartaoDiaDosNamorados("dani");
        cartoes[1] = new CartaoNatal("piove");
        cartoes[2] = new CartaoAniversario("caio");

        for(CartaoWeb cartao: cartoes)
        {
            System.out.println(cartao.retornarMensagem(cartao.destinatario));
        }
    }
}