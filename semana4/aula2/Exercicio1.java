public class Exercicio1
{
    public static class Lampada
    {
        protected boolean ligado;

        public Lampada() {}
        public Lampada(boolean ligado)
        {
            this.ligado = ligado;
        }

        public void setLigado(boolean ligado)
        {
            this.ligado = ligado;
        }

        public boolean isLigado()
        {
            return this.ligado;
        }

        public void liga()
        {
            this.ligado = true;
        }
        
        public void desliga()
        {
            this.ligado = false;
        }
    }

    
    public static class LampadaFluorescente extends Lampada
    {
        private int comprimento;

        public LampadaFluorescente() {}
        
        public LampadaFluorescente(int comprimento)
        {
            this.comprimento = comprimento;
        }

        public LampadaFluorescente(boolean ligado)
        {
            super(ligado);
        }

        public LampadaFluorescente(boolean ligado, int comprimento)
        {
            super(ligado);
            this.comprimento = comprimento;
        }

        public void setComprimento(int comprimento)
        {
            this.comprimento = comprimento;
        }

        public int getComprimento()
        {
            return this.comprimento;
        }
    }

    public static class LampadaLED extends Lampada
    {
        public LampadaLED() {}
        public LampadaLED(boolean ligado)
        {
            super(ligado);
        }
    }

    public static void main(String[] args)
    {
        LampadaFluorescente l1 = new LampadaFluorescente();
        LampadaLED l2 = new LampadaLED();
    
        System.out.println(l1.isLigado());
        System.out.println(l2.isLigado());

        l1.liga();
        l2.liga();

        System.out.println(l1.isLigado());
        System.out.println(l2.isLigado());
    }
}