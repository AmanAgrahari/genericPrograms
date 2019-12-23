package co.vinod.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import co.vinod.entity.Product;

public class Program01 {

public static void main(String[] args) {

	 Set<Product> products= new HashSet<Product>();
	 
	 products.add(new Product(1,"chal",12.3));
	 products.add(new Product(2,"chang",54.3));
	 products.add(new Product(3,"annyseed",12.3));
	 products.add(new Product(4,"chal",12.3));
	 products.add(new Product(1,"tea",12.3));
	 products.add(new Product(1,"chal",12.3));
	 products.add(new Product(3,"annyseed",12.3));
	 products.add(new Product(3,"annyseed",12.3));
	 
	 System.out.println("size="+ products.size());
	 for(Product p:products){
		 System.out.println(p);
		 System.out.println(p.hashCode());
	 }
} 
}

