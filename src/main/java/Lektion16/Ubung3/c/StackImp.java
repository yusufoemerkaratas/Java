package Lektion16.Ubung3.c;

import java.util.ArrayList;
import java.util.*;
import java.util.Objects;

public class StackImp<T> implements IStack<T>{
    List<T> stack = new ArrayList<>();
    @Override
    public void push(T o) {
    stack.add(o);
    }

    @Override
    public void pop() {
        if(stack.size()==0) throw new IllegalStateException("Stack ist leer");
        stack.remove(stack.size()-1);
    }
    public int size() {
        return stack.size();
    }
}
