package co.vinod.program;

import java.util.HashMap;
import java.util.Map;

import co.vinod.entity.Address;
import co.vinod.entity.Person2;

public class Program3 {

    public static void main(final String[] args) {

        final Map<Person2, Address> map = new HashMap<Person2, Address>();
        map.put(new Person2("vinod"), new Address("lyt", "banglore", "ka"));
        map.put(new Person2("shyam"), new Address("bank colony", "banglore", "ka"));
        map.put(new Person2("vinod"), new Address("lyt", "banglore", "ka"));
        map.put(new Person2("shyam"), new Address("bank colony", "banglore", "ka"));
        System.out.println(map.size());
        for (final Person2 p : map.keySet()) {
            System.out.println(p);
            System.out.println("--->" + map.get(p));
            System.out.println("--->" + map.get(p).hashCode());
            System.out.println();
        }

    }
}