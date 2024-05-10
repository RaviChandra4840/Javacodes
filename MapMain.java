import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        
        /************************** Hashcode ************************/
        MapContact contact = new MapContact("Alice", 30);
        MapContact contactCopy = new MapContact(contact);

        System.out.println("First Hashcode: " + contact.hashCode());
        System.out.println("Second Hashcode: " + contactCopy.hashCode());

        /************************** Equals ************************/

        System.out.println("Equality: " + contact.equals(contactCopy));

        /************************** HashCode and Equals ************************/

        Map<MapContact, String> peopleMap = new HashMap<>();
        
        peopleMap.put(new MapContact("Alice", 30), "1806 Farm Meadow Drive");
        peopleMap.put(new MapContact("Bob", 35), "4046 Weekley Street");
        peopleMap.put(new MapContact("Charles", 36), "1110 Cerullo Road");
        peopleMap.put(new MapContact("Todd", 35), "3300 Ross Street");
        peopleMap.put(new MapContact("Leah", 43), "3392 Clarksburg Park Road");
        peopleMap.put(new MapContact("Brad", 40), "499 Diane Street");
        peopleMap.put(new MapContact("Stephen", 36), "4 Meadowview Drive");
        peopleMap.put(new MapContact("Lauren", 37), "514 Summit Park Avenue");
        peopleMap.put(new MapContact("Adam", 42), "146 Devils Hill Road");
        peopleMap.put(new MapContact("Hilary", 34), "397 Winifred Way");
        peopleMap.put(new MapContact("Noah", 41), "1833 Maloy Court");

        System.out.println("\nAlice's address is: " + peopleMap.get(new MapContact("Alice", 30)));

        System.out.println("\nAdam's address is: " + peopleMap.get(new MapContact("Adam", 42)));

        System.out.print("\nIs Noah, 41 years of age, in my contacts? ");
        String response = peopleMap.containsKey(new MapContact("Noah", 41)) ? "Yes!" : "No, sorry";
        System.out.println(response);

    }
}
