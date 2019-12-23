package co.vinod.program;

import java.util.Map;
import java.util.TreeMap;

public class program01 {
public static void main(String[] args) {
	Map<Integer,String> map= new TreeMap<Integer,String>();
map.put(1, "vinod");
map.put(99, "scott");
map.put(7652, "miller");
map.put(2, "shyam");
map.put(5, "syed");
map.put(99, "john due");

System.out.println(map);
}
}
