package co.vinod.program;

import java.util.Map;
import java.util.TreeMap;

import co.vinod.entity.Person;

public class program02 {
    public static void main(final String[] args) {
        final Map<Person, String> map = new TreeMap<Person, String>();
        map.put(new Person("john", "smith"), "jayanagar,banglore");
        map.put(new Person("vonod", "kumar"), "isro layout,banglore");
        map.put(new Person("shivam", "sundar"), "isro layout,banglore");
        map.put(new Person("vonod", "kumar"), "rasavangudi,banglore");
        map.put(new Person("john", "doe"), "17th cross,dallas");
        System.out.println("map contains" + map.size() + "elements");
        for (final Person p : map.keySet()) {
            System.out.println(p);
        }
    }

}
