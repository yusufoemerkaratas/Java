package Lektion21.Ubung3;

public class Knoten <T>{
    T wert;
    Knoten<T> links;
    Knoten<T> rechts;

    Knoten(T wert){
        this.wert=wert;
        this.links=null;
        this.rechts=null;
    }
}
