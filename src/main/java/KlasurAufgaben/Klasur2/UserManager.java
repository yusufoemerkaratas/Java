package KlasurAufgaben.Klasur2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager<User>{

    @Override
    public void serialize(List<User> users) {
    try(ObjectOutputStream objectOutputStream =new ObjectOutputStream(new FileOutputStream("user.dat"))){
        objectOutputStream.writeObject(users);
    }catch (IOException E){
        System.out.println(E.getMessage());
    }
    }

    @Override
    public List<User> deserialize() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.dat"))) {
            return (List<User>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("hata");
        }
    }

}
