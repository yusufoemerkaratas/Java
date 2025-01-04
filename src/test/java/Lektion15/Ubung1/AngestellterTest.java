package Lektion15.Ubung1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AngestellterTest {
    @Test
    void angestellerGehaltTest(){
        Angestellter a1=new Angestellter("yusuf",12,"ka",1200,"20,20");
        assertEquals(1200,a1.getGehalt());
    }
    @Test
    void AbteilungstellerTest(){
        Abteilungsleiter ab1 = new Abteilungsleiter("a",122,"aaaa",1440,"aa");
        assertEquals(2880,ab1.getGehalt());
    }

}