import java.util.HashMap;

public class Program {
    private HashMap<String, String> hashmap;

    public static void printKeys(HashMap<String, String> hashmap) {
        hashmap = new HashMap<>();
        hashmap.put("tbd", "to be determined");
        hashmap.put("oop", "object-oriented programming");
        hashmap.put("fyt", "free young thug");
        
        for(String key: hashmap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        hashmap = new HashMap<>();

        for(String key : hashmap.keySet()) {
            if(key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        hashmap = new HashMap<>();

        for (String key : hashmap.keySet()) {
            if(key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

}
