package co.vinod.program;

import java.util.HashMap;
import java.util.Map;

import co.vinod.entity.Address;
import co.vinod.entity.Person;

public class Program02 {

    public static void main(final String[] args) {

        final Map<Person, Address> map = new HashMap<Person, Address>();
        map.put(new Person("vinod", "kumar"), new Address("lyt", "banglore", "ka"));
        map.put(new Person("shyam", "sundar"), new Address("bank colony", "banglore", "ka"));
        map.put(new Person("vinod", "kumar"), new Address("lyt", "banglore", "ka"));
        map.put(new Person("shyam", "sundar"), new Address("bank colony", "banglore", "ka"));
        System.out.println(map.size());
        for (final Person p : map.keySet()) {
            System.out.println(p);
            System.out.println("--->" + map.get(p));
            System.out.println("--->" + map.get(p).hashCode());
            System.out.println();
        }

    }
}