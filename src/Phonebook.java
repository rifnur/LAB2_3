import java.util.HashMap;
import java.util.HashSet;

public class Phonebook {
    HashMap<String, HashSet<String>> user = new HashMap<>();

    public Phonebook() {
       }

    public void add(String name, String phone) {
        HashSet<String> spisok =  user.getOrDefault(name, new HashSet<>());
        spisok.add(phone);
        user.put(name, spisok);
    }

    public void get(String name) {
        System.out.println("ФИО " + name + " Номер:" +user.getOrDefault(name, new HashSet<>()));
    }
}