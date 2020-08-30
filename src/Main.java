import java.util.*;

public class Main {
    public static void main(String[] args) {

        String [] massiv = {"dad","mom","cat","dog","mom","sun","table","cat","bread"
                ,"milk","tea","apple","orange","fruit"};
        Set<String> unicum = new HashSet<>();
        HashMap<String,Integer> massivVse = new HashMap<String,Integer>();

        for (int i=0;i< massiv.length;i++){
            if (unicum.add(massiv[i])){
                massivVse.put(massiv[i],1);
            }
            else {
                massivVse.put(massiv[i],(Integer)(massivVse.get(massiv[i]))+1);
            }
        }
        System.out.println(massivVse);

        //добавляем в справочник клингтов
        Phonebook spisok = new Phonebook();
        spisok.add("Rifnur", "123456");
        spisok.add("Kolya", "456789");
        spisok.add("Rifnur", "147852");
        //выводим список
        spisok.get("Rifnur");
        spisok.get("Kolya");

    }

}
