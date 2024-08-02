public class Contador
{
    public int cont;

    public Contador() {}
    public Contador(int cont)
    {
        if(cont >= 0)
            this.cont = cont;
    }

    public void setCont(int cont)
    {
        if(cont >= 0)
            this.cont = cont;
    }
    
    public int getCont()
    {
        return this.cont;
    }

    public void zeraCont()
    {
        this.cont = 0;
    }

    public void incrementaCont()
    {
        this.cont++;
    }

    public void decrementaCont()
    {
        if(cont > 0)
            this.cont--;
    }
}