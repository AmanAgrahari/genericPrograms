package co.vinod.programs;

import co.vinod.dao.DaoFactory;
import co.vinod.dao.ProductDao;
import co.vinod.entity.Product;

public class program02 {

	public static void main(String[] args)
	{
		ProductDao dao;
		dao=DaoFactory.getProductDao();
		dao.getProduct(12);
		dao.deleteProduct(14);
		
		Product p=new Product();
		dao.saveProduct(p);
	}
}
