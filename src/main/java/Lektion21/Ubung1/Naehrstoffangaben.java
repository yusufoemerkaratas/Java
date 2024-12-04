package Lektion21.Ubung1;

public class Naehrstoffangaben {
    private double portionGroesse;
    private double anzahlPortionen;
    private double eiweiss;
    private double fett;
    private double kohlenhydrate;
    private double natrium;

    private Naehrstoffangaben(NaehrBuilder builder){
        this.portionGroesse= builder.portionGroesse;;
        this.anzahlPortionen = builder.anzahlPortionen;
        this.eiweiss = builder.eiweiss;
        this.fett = builder.fett;
        this.kohlenhydrate = builder.kohlenhydrate;
        this.natrium = builder.natrium;
    }
public static class NaehrBuilder{
    private double portionGroesse;
    private double anzahlPortionen;
    private double eiweiss;
    private double fett;
    private double kohlenhydrate;
    private double natrium;

    public  NaehrBuilder(double portionGroesse, double anzahlPortionen){
        this.portionGroesse=portionGroesse;
        this.anzahlPortionen=anzahlPortionen;
    }
    public NaehrBuilder withEiweiss(double eiweiss){
        this.eiweiss=eiweiss;
        return this;
    }
    public NaehrBuilder withFett(double fett){
        this.fett=fett;
        return this;
    }
    public NaehrBuilder withKohlenhydrate(double kohlenhydrate){
        this.kohlenhydrate=kohlenhydrate;
        return this;
    }
    public NaehrBuilder withNatrium(double natrium){
        this.natrium=natrium;
    return this;
    }
    public Naehrstoffangaben build(){
        return new Naehrstoffangaben(this);
    }
}
}
