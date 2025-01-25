package KlasurAufgaben.Klasur2;

import java.util.ArrayList;

public class TwotterSystem {
    ArrayList<User> userlist = new ArrayList<>();
    public void addUser(User user) {
        if (!userlist.contains(user)) {
            userlist.add(user);
        }
    }

    public void addMessage(User u,Message m){
        u.verfassMessage(m);
    }
    public ArrayList<Message> getAllMessages(){
        ArrayList<Message> collect =new ArrayList<>();
        for(User u : this.userlist){
            for(Message m : u.nachrichten){
                collect.add( m);

            }
        }
        return collect;
    }
    public ArrayList<Message> getAllMessagesFromUser(User u){
        ArrayList<Message> collect =new ArrayList<>();
        for(Message m : u.nachrichten){
            collect.add(m);
        }
        return collect;
    }
    public ArrayList<String> getAllMessagesFromDate(String date){
        ArrayList<String> collect=new ArrayList<>();
        for(User u : this.userlist) {
            for (Message m : u.nachrichten) {
                if (m.getCreationDate().equals(date)) collect.add(m.getCreationDate());
            }
        }
        return collect;
    }
}
