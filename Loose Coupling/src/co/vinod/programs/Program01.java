package co.vinod.programs;

import co.vinod.dao.ProductDao;
import co.vinod.dao.ProductDaoFileImpl;
import co.vinod.entity.Product;

public class Program01 {

	public static void main(String[] args)
	{
	ProductDao dao;
	dao=new ProductDaoFileImpl();
	dao.getProduct(12);
	dao.deleteProduct(14);
	
	Product p=new Product();
	dao.saveProduct(p);
}
}