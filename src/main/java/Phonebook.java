import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

   private static  Map<String,String> book;
   private static List<Contact> bookList;
    Phonebook(){
        book= new HashMap<>();
        bookList = new ArrayList<>();
    }
        void printMap(){
            System.out.println(book);
        }
    void printList(){
        System.out.println(bookList);
    }

    void add(String phonenumber, String surname){
        book.put(phonenumber,surname);
        Contact cont = new Contact(surname,phonenumber);
        bookList.add(cont);
    }

    void get (String SurnameToFind){
        boolean flag=false;
       for(Map.Entry<String,String> entry : book.entrySet()){
           if(entry.getValue().contains(SurnameToFind)) {
               System.out.println("поиск по фамилии: \""+SurnameToFind+"\" HashMap: "+entry.getValue() + " " + entry.getKey());
               flag=true;
           }
           }
    if (!flag) System.out.println("в HashMap по фамилии \"" +SurnameToFind+ "\" телефон не найден");


    flag=false;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getSurname().contains(SurnameToFind)){
                flag=true;
                System.out.println("поиск по фамилии: \""+SurnameToFind+"\" ArrayList: "+bookList.get(i).getSurname() + " " + bookList.get(i).getPhoneNumber());
            }

        }
        if (!flag) System.out.println("в ArrayList по фамилии \"" +SurnameToFind+ "\" телефон не найден");

    }





}
