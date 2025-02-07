package ss2015;

import java.io.Serializable;
import java.util.*;
public class SpielDaten implements Serializable {
    private int geld;
    List<String> spilerid;

    private SpielDaten(int geld, List<String> spilerid) {
        this.geld = geld;
        this.spilerid = spilerid;
    }

    public static class builder {
        private int geld;
        List<String> spilerid=new ArrayList<String>();

        builder(int geld) {
            this.geld = geld;
        }

       public builder addid(String id) {
            this.spilerid.add(id);
            return this;
        }

        public SpielDaten build(){
            return new SpielDaten(this.geld,this.spilerid);
        }

    }
}





