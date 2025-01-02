package Lektion23;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      // a
        List<Mannschaft> tabelle = Mannschaft.createTabelle();
      //b
     //   tabelle.stream().
        //   filter(man -> man.punkte>50).
        //   forEach(man->System.out.println(man.name));
    //c
      //  tabelle.stream().
        //  forEach(m->System.out.println(m.name));
        //d
     /*   tabelle.stream().
                filter(m->m.name.charAt(0)=='F').
                sorted(Comparator.comparing(m->m.name)).
                forEach(m-> System.out.println(m.name));
    */
        /* e
     Mannschaft man= tabelle.stream().
             max(Comparator.comparing(m->m.gegentore)).get();
     System.out.println(man);
*/
        /*Ubung2
        tabelle.stream()
                .max(Comparator.comparing(m -> m.gegentore))
                .ifPresent(System.out::println);
*/

    }
}
