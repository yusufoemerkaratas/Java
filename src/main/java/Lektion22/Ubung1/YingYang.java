package Lektion22.Ubung1;

public class YingYang   {
    public static void main(String args[]){
        YingYangThread yingThread = new YingYangThread("Ying");
        yingThread.start();
        YingYangThread yangThread = new YingYangThread("Yang");
        yangThread.start();
    }
}
