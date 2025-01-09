package Lektion16.Ubung3.b;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Stack {
    List<Objects> stack = new ArrayList<>();
    public Stack(){
        this.stack=null;
    }
    public void push(Objects o){
        stack.add(o);
    }
    public void pop(){
        if(stack.size()==0) throw new IllegalStateException("Stack ist leer");
        stack.remove(stack.size()-1);
    }
    public int size(){
        return stack.size();
    }


}
