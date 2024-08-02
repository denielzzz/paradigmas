public class Time
{
    public int hora;
    public int minuto;

    public Time() {}

    public Time(int hora, int minuto)
    {
        if((hora >= 0 && hora < 24) && (minuto >= 0 && minuto < 60))
            this.hora = hora;
            this.minuto = minuto;
    }

    public void setHora(int hora)
    {
        if(hora >= 0 && hora < 24)
            this.hora = hora;
    }

    public void setMinuto(int minuto)
    {
        if(minuto >= 0 && minuto < 60)
            this.minuto = minuto;
    }

    public void setTime(int hora, int minuto)
    {
        setHora(hora);
        setMinuto(minuto);
    }

    public int getHora()
    {
        return this.hora;
    }

    public int getMinuto()
    {
        return this.minuto;
    }

    public boolean anterior(int hora, int minuto)
    {
        if(hora < this.hora)
            return true;
            if(hora == this.hora && minuto < this.minuto)
            return true;
            return false;
    }
    
    public boolean posterior(int hora, int minuto)
    {
        if(hora > this.hora)
            return true;
        if(hora == this.hora && minuto > this.minuto)
        return true;
        return false;
    }
    
    public boolean equal(int hora, int minuto)
    {
        if(hora == this.hora)
        return true;
        return false;
    }

    public String toString()
    {
        return String.format("%02d:%02d", this.hora, this.minuto);
    }
}