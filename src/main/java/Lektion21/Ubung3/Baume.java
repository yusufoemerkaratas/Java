package Lektion21.Ubung3;

public class Baume<T> {
    private Knoten<T> root;

    Baume() {
        this.root = null;
    }

    public void einfuegen(T wert) {
        Knoten<T> neu = new Knoten<>(wert);
        if (root == null) {
            root = neu;
        } else {
            einfuegen(root, neu);
        }
    }

    private void einfuegen(Knoten<T> temp, Knoten<T> neu) {
        if (Math.random() > 0.5) {
            if (temp.links == null) {
                temp.links = neu;
            } else {
                einfuegen(temp.links, neu);
            }
        } else {
            if (temp.rechts == null) {
                temp.rechts = neu;
            } else {
                einfuegen(temp.rechts, neu);
            }
        }
    }

    public void baumAusgehen() {
        baumAusgehen(root);
    }

    private void baumAusgehen(Knoten<T> temp) {
        if (temp.links != null) baumAusgehen(temp.links);
        System.out.println(temp.wert);
        if (temp.rechts != null) baumAusgehen(temp.rechts);
    }

    public T getRootValue() {
        if(root!=null) return root.wert;
        else  return null;
    }


    public T getRootLinksWert() {
        if(root!=null&& root.links!=null) return root.links.wert;
        else return null;
    }

    public T getRootRechtsWert() {
        if(root!=null&& root.rechts!=null) return root.rechts.wert;
        else return null;
    }
}



