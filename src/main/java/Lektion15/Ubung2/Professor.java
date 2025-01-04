package Lektion15.Ubung2;

public class Professor extends Person{
    private String fach;
    Professor(String fach){
        this.fach=fach;
    }
    @Override
    public void gibTaetigkeitAus(){
        System.out.println("ich unterrichte: "+fach);
    }

}
