
import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapRunner {
    public static void main(String[] args) {
        Map<String, Integer> contacts = new HashMap<>();

        // Adding contacts
        contacts.put("John", 655);
        contacts.put("Alice", 5653);
        contacts.put("Bob", 5534);
        contacts.put("Parker", 9834);
        contacts.put("Marie", 994);
        contacts.put("Jimmy", 124);


        // Retrieving a contact
        System.out.println("John's phone number: " + contacts.get("John"));

        // Iterating over contacts (order is not guaranteed)
        for (Map.Entry<String, Integer> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
