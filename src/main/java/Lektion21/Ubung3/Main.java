package Lektion21.Ubung3;

public class Main {
    public static void main(String[] args){
        Baume<String> baum=new Baume<>();
        baum.einfuegen("Cool");
        baum.einfuegen("Aaronson");
        baum.einfuegen("Garrett");
        baum.einfuegen("Zylla");
        baum.einfuegen("Cool");

        System.out.println("Knoten vom Baum");
        baum.baumAusgehen();
    }
}
