package Lektion16.Ubung3.a;

import java.util.ArrayList;
import java.util.Objects;

public class Stack extends ArrayList<Objects> {
    public void  push(Objects o){
        this.add(o);
    }
    public void pop(){
        if(this.size()==0) throw new IllegalStateException("Stack ist leer");
        remove(this.size()-1);
    }
}

