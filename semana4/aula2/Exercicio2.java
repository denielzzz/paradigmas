public class Exercicio2
{
    public static class Ingresso
    {
        protected float valor;
    
        public Ingresso() {}
        public Ingresso(float valor)
        {
            this.valor = valor;
        }

        public void setValor(float valor)
        {
            this.valor = valor;
        }

        public float getValor()
        {
            return this.valor;
        }

        public void exibeValor()
        {
            System.out.println(this.valor);
        }
    }

    public static class IngressoVip extends Ingresso
    {
        protected float valorAdc;
        
        public IngressoVip() {}
        public IngressoVip(float valorAdc)
        {
            this.valorAdc = valorAdc;
        }
        public IngressoVip(float valor, float valorAdc)
        {
            super(valor);
            this.valorAdc = valorAdc;
        }

        public void setValorAdc(float valorAdc)
        {
            this.valorAdc = valorAdc;
        }

        public float getValorAdc()
        {
            return this.valorAdc;
        }

        public float valorIngresso()
        {
            return super.valor + this.valorAdc;
        }
        
    }

    public static class IngressoNorm extends Ingresso
    {
        public IngressoNorm() {}
        public IngressoNorm(float valor)
        {
            super(valor);
        }

        public void exibeTipo()
        {
            System.out.println("Ingresso Normal");
        }
    }

    public static class IngressoCam extends IngressoVip
    {
        private float valorAdc2;
    
        public IngressoCam() {}
        public IngressoCam(float valorAdc2)
        {
            this.valorAdc2 = valorAdc2;
        }
        public IngressoCam(float valor, float valorAdc, float valorAdc2)
        {
            super(valor, valorAdc);
            this.valorAdc2 = valorAdc2;
        }

        public void setValorAdc2(float valorAdc2)
        {
            this.valorAdc2 = valorAdc2;
        }

        public float getValorAdc2()
        {
            return this.valorAdc2;
        }

        @Override
        public float valorIngresso()
        {
            return super.valor + super.valorAdc + this.valorAdc2;
        }
    }

    public static void main(String[] args)
    {
        IngressoNorm norm = new IngressoNorm(10);
        IngressoVip vip = new IngressoVip(10, 5);
        IngressoCam cam = new IngressoCam(10, 5, 10);
    
        norm.exibeValor();
        vip.exibeValor();
        cam.exibeValor();

        System.out.println(vip.valorIngresso());
        System.out.println(cam.valorIngresso());
    }
}