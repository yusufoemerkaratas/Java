package KlasurAufgaben.Klasur5;

public class FalcheIBANException extends Exception {
    String msg;
    FalcheIBANException(){
        super("falsche iban");
    }
    FalcheIBANException(String msg){
        super(msg);
    }
}
