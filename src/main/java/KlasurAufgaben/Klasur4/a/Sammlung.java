package KlasurAufgaben.Klasur4.a;

import java.util.*;

public class Sammlung {
    Map<String,MusikStueck> mysammlung=new HashMap<String,MusikStueck>();

    public void einfuegen(MusikStueck neu){
        if(mysammlung.containsKey(neu.titel)){
            throw new IllegalArgumentException("This key is already in map");
        }else{
            mysammlung.put(neu.titel,neu);
        }
    }
    public List<MusikStueck> getAlleMusikStueckNachTitel(){
        ArrayList<MusikStueck> array=new ArrayList<>(mysammlung.values());
        array.sort(new VergleicheMusikStueckTitel());
        return array;
    }
    public List<MusikStueck> getAlleMusikStueckNachLaenge(){
        ArrayList<MusikStueck> array=new ArrayList<>(mysammlung.values());
        array.sort(new VergleicheMusikStueckNachLaenge());
        return array;
    }
}