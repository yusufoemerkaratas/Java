package KlasurAufgaben.Klasur4;

public class MusikStueck {
    String titel;
    String interpreter;
    int laenge;

    public MusikStueck(String titel, String interpreter, int laenge)
    {
        this.titel = titel;
        this.interpreter = interpreter;
        this.laenge = laenge;
    }
    @Override
    public String toString(){
        return "Titel: " + titel+ "Interpreter: "+ interpreter+ "Laenge:  "+ String.valueOf(laenge);
    }
}
