package co.vinod.dao;

public class DaoFactory {

	public static ProductDao getProductDao() {
		// TODO Auto-generated method stub
		return new ProductDaoFileImpl();
	}

}
