package KlasurAufgaben.Klasur2;

import java.time.LocalDate;

public class Message {
    private  final String text;
    private final String creationDate;
    public Message(String text)
    {
        this.text = text;
        creationDate = LocalDate.now().toString();
    }
    public String getText()
    {
        return text;
    }
    public String getCreationDate()
    {
        return creationDate;
    }
}
