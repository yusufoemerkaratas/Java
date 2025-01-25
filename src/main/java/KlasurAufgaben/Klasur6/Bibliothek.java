package KlasurAufgaben.Klasur6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bibliothek {
List<Buch> sammlung;
    Bibliothek(){
        this.sammlung=new ArrayList<>();
    }
    public void einFuegen(List<Buch> neubucher){
        Buchsortier buchsortier=new Buchsortier();
            sammlung.addAll(neubucher);

        buchsortier.sortier(sammlung);
    }
    public List<Buch> buchFinder(String author){
    return  sammlung.stream().filter(m->m.autor.equals(author)).collect(Collectors.toList());
    }
}
