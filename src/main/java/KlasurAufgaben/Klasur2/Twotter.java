package KlasurAufgaben.Klasur2;

import java.util.ArrayList;
import java.util.List;

public class Twotter {
    public static void main(String args[]) {
        User u1 = new User("asd", "asdasdsa");
        User u2 = new User("asddf", "asdasdsa");
        User u3 = new User("assddadd", "asdasssdsa");
        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        UserManager userManager= new UserManager();
        userManager.serialize(users);

    }
}
