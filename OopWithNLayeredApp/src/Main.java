import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAcces.HibernateProductDao;
import oopWithNLayeredApp.dataAcces.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"Iphone Xr",11);
		Logger[] loggers = {new DatabaseLogger(),new FileLogger()};
		ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
		productManager.add(product1);
		
	}

}
