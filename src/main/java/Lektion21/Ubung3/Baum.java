package Lektion21.Ubung3;

public class Baum<T extends  Comparable<T>> {
    private Element root;

    private class Element {
        T value;
        Element links;
        Element rechts;

        public Element(T value) {
            this.value = value;
            this.links = null;
            this.rechts = null;
        }
    }

    public void add(T value) {
        root = addRecursive(root, value);
    }

    private Element addRecursive(Element temp, T value) {
        if (temp == null) {
            return new Element(value);
        }
        if (value.compareTo(temp.value) < 0) {
            temp.links = addRecursive(temp.links, value);
        } else if (value.compareTo(temp.value) > 0) {
            temp.rechts = addRecursive(temp.rechts, value);
        }
        return temp;
    }
}