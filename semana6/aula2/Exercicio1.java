import java.util.*;

public class Exercicio1
{
    public static class Endereço
    {
        String rua, bairro, cidade, estado;
        int numero;

        public Endereço() {}
        public Endereço(String rua, String bairro, String cidade, String estado, int numero)
        {
            this.rua = rua;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
            this.numero = numero;
        }
    }

    public abstract static class Imovel
    {
        Endereço endereço;
        float preço;

        public Imovel(){}
        
        public Imovel(Endereço endereço, float preço)
        {
            this.endereço = endereço;
            this.preço = preço;
        }

        public Imovel(String rua, String bairro, String cidade, String estado, int numero, float preço)
        {
            this.endereço = new Endereço(rua, bairro, cidade, estado, numero);
            this.preço = preço;
        }

        public abstract float calcularValorImovel();
    }
    
    public static class ImovelNovo extends Imovel
    {
        public ImovelNovo() {}
        
        public ImovelNovo(Endereço endereço, float preço)
        {
            super(endereço, preço);
        }

        public ImovelNovo(String rua, String bairro, String cidade, String estado, int numero, float preço)
        {
            super(rua, bairro, cidade, estado, numero, preço);
        }

        public float calcularValorImovel()
        {
            return this.preço;
        }
    }
    
    public static class ImovelVelho extends Imovel
    {
        public ImovelVelho() {}
        
        public ImovelVelho(Endereço endereço, float preço)
        {
            super(endereço, preço);
        }

        public ImovelVelho(String rua, String bairro, String cidade, String estado, int numero, float preço)
        {
            super(rua, bairro, cidade, estado, numero, preço);
        }

        public float calcularValorImovel()
        {
            return this.preço;
        }
    }

    public static void main(String[] args)
    {
        ArrayList<Imovel> array = new ArrayList<Imovel>(200);

        for(int i = 0; i < 200; i++)
        {
            if(i % 2 == 0)
            {
                Imovel endereçoVelho = new ImovelVelho("pao", "carne", "queijo", "tomate", 2 , 10);
                array.add(endereçoVelho);
            }
            else
            {
                Imovel endereçoNovo = new ImovelNovo("pao", "carne", "queijo", "tomate", 2 , 100);
                array.add(endereçoNovo);
            }
        }
        
        Iterator<Imovel> it;
        for(it = array.iterator(); it.hasNext();)
        {
            System.out.println(it.next().calcularValorImovel());
        }
    }
}