package co.vinod.dao;

import co.vinod.entity.Product;
public class ProductDaoFileImpl implements ProductDao {

	@Override
	public Product getProduct(int id) {
		System.out.println("getting a product from FILE..");
		return null;
	}

	@Override
	public void saveProduct(Product p) {
		System.out.println("Saving a product from FILE..");
	}

	@Override
	public void updateProduct(Product p) {
		 System.out.println("Updating a product from FILE..");
		
	}

	@Override
	public void deleteProduct(int id) {
		System.out.println("Deleting a product from FILE.."); 
		
	}

}
