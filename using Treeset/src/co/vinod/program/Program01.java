package co.vinod.program;

import java.util.Set;
import java.util.TreeSet;
import co.vinod.entity.product;

public class Program01 {
	public static void main(String[] args) {
		
		Set<product> products= new TreeSet<product>();
		 
		 products.add(new product(1,"chal",18.4));
		 products.add(new product(1,"chal",18.4));
		 products.add(new product(2,"chang",22.4));
		 products.add(new product(1,"chal",18.4));
		 products.add(new product(3,"syrup",45.4));
		 System.out.println("size="+ products.size());
for(product p: products)
{System.out.println(p);
	}
	}
}

