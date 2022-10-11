package oopWithNLayeredApp.dataAcces;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
		public void add(Product product) {
			//Sadece ve sadece db erişim kodları buraya yazılır...Sql
			System.out.println("Hibernate ile veritabanına eklendi");

		}
}
