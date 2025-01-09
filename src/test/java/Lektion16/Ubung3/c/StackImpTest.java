package Lektion16.Ubung3.c;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class StackImpTest {
    @Test
    void testStack(){
        // Push işlemi
        Stack stack = new Stack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        assertEquals(3, stack.size(), "Size of Stack ist falsch!");

        // Pop işlemi
        assertEquals("C", stack.pop(), "OBerste elemant falsch!");
        assertEquals("B", stack.pop(), "OBerste elemant falsch!");
        assertEquals("A", stack.pop(), "OBerste elemant falsch!");

        // Boş Stack kontrolü
        assertThrows(IllegalStateException.class, stack::pop, "Stack boşken pop çalıştırılmamalı!");
    }

}