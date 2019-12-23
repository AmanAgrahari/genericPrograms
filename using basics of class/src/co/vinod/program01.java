package co.vinod;

import co.vinod.entity.product;

public class program01 {
	public static void main(String[] args) {
		
		product p1;
		p1=new product();
		p1.setId(12);
		p1.setName("optical");
		p1.setPrice(5.9);
		System.out.println(p1.getId());
	}
	}


