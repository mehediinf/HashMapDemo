import java.util.HashMap;

public class HashMapDemo {
    
  
    public static void main(String[] args) {
        
        HashMap <Integer,String> sHashMap = new HashMap<>();

        sHashMap.put(101, "Mehedi");
        sHashMap.put(102, "Manik Vai");
        sHashMap.put(103, "Deloar Vai");
        sHashMap.put(104, "Masum");
        sHashMap.put(105, "Abubakar Vai");

        System.out.println(sHashMap);
        System.out.println(sHashMap.get(102));
        System.out.println(sHashMap.get(103));
        System.out.println(sHashMap.get(104));
        System.out.println(sHashMap.get(105));


    }
}
