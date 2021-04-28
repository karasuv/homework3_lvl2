import java.util.*;

public class homework3 {
    public static void main(String[] args) {


        System.out.println( " /////////////////  задание  №1    ///////////////");
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Первый");
        arr.add("второй");
        arr.add("третий");
        arr.add("четвертый");
        arr.add("пятый");
        arr.add("второй");
        arr.add("третий");
        arr.add("четвертый");
        arr.add("пятый");
        arr.add("третий");
        arr.add("четвертый");
        arr.add("пятый");
        arr.add("четвертый");
        arr.add("пятый");
        arr.add("пятый");
        /////////////////////вариант 1 ///////////////////
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.size() ; i++) {
           // String temp = arr.get(i);
            set.add(arr.get(i));
        }
        for (String s : set) {int count=0;
            for (int i = 0; i < arr.size(); i++) {
                if (s.equals(arr.get(i))) count++;
            }
             System.out.println(s + " встречается "+ count + " раз");
        }
        System.out.println( " ////////////////////вариант 2 ////////////////");

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i <arr.size() ; i++) {

            if(map.containsKey(arr.get(i))) map.replace(arr.get(i),map.get(arr.get(i)),map.get(arr.get(i))+1);
            else map.putIfAbsent(arr.get(i),1);
        }
        System.out.println(map);

        System.out.println( " /////////////////  задание  №2    ///////////////");

        Phonebook phonebook = new Phonebook();

        phonebook.add("89138881234","Сидоров Андрей");
        phonebook.add("89139998877","Познер");
        phonebook.add("89338884321","Нагиев");
        phonebook.add("89998887777","Ургант Иван");
        phonebook.add("89338884321","Масляков Александр Васильевич");
        phonebook.add("89995556666","Ургант Андрей");
        phonebook.add("89237776431","Масляков Александр Александрович");
        phonebook.add("89991112345","Маслякова Светлана");
        System.out.println("Вся телефонная книга:");
        phonebook.printMap();
        System.out.println();
        phonebook.printList();
        System.out.println();
        System.out.println("Варианты поиска по Фамилии: ");
        phonebook.get("Познер");
        phonebook.get("Масляков");
        phonebook.get("Сидорова");
        phonebook.get("Иван");
        phonebook.get("Андрей");











    }

}
