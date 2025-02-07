package KlasurAufgaben.Klasur5.a;

import org.junit.jupiter.api.Test;

import static KlasurAufgaben.Klasur5.a.IBAN.checkIBAN;
import static org.junit.jupiter.api.Assertions.*;

class IBANTest {
    @Test
    void checkIbanTest(){
        String iban="DE1231231231525";
        String iban1="DE1231231231254567890";

        assertThrows(FalscheIBANException.class,()->checkIBAN(iban1));


    }

}