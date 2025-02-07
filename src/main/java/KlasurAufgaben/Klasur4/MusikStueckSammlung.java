package KlasurAufgaben.Klasur4;

import java.util.HashMap;
import java.util.*;

public class MusikStueckSammlung {
    Map<String,MusikStueck> collect;

    MusikStueckSammlung(){
        this.collect=new HashMap<>();
    }
    public void musikStueckEinfuegen(MusikStueck neu){
        if(collect.containsKey(neu.titel)) throw new IllegalArgumentException("es ist schon in der Sammlung");
        else collect.put(neu.titel,neu);
    }
    public List<MusikStueck> getAlleMusikStueckeNachTitel(){
        List<MusikStueck> array= new ArrayList<>(collect.values());
            array.sort(Comparator.comparing(m->m.titel));
        return array;
    }
    public List<MusikStueck> getAlleMusikStueckeNachLaenge(){
        List<MusikStueck> array= new ArrayList<>(collect.values());
        array.sort(Comparator.comparing(m->m.laenge));
            return array;
    }

}
