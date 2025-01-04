package Lektion15.Ubung2;

public class Student extends Person{
    private String fach;
    Student(String fach){
        this.fach=fach;
    }
    @Override
    public void gibTaetigkeitAus(){
        System.out.println("ich besuche: "+fach);
    }
}
