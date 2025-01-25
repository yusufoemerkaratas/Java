package KlasurAufgaben.Klasur6;

public   class Buch implements IBuch{
    public  String name;
    public    String autor;
    public    String verlag;
    public int preisInCents;
    public String reihename;

     Buch(String name, String autor, String verlag, int preisInCents,String reihename)
    {
        this.name = name;
        this.autor = autor;
        this.verlag = verlag;
        this.preisInCents = preisInCents;
        this.reihename=reihename;
    }
}

