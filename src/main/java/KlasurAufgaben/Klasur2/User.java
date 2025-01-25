package KlasurAufgaben.Klasur2;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private final String benutzerName;
    private String password;
     ArrayList<Message> nachrichten;

    User(String benutzerName,String password){
        this.benutzerName=benutzerName;
        this.password=password;
        this.nachrichten=null;
    }
    public void verfassMessage(Message u){
        if(u.getText().length()>140){
            throw new RuntimeException("so lange text");
        }else{
            nachrichten.add(u);

        }

        }
}
