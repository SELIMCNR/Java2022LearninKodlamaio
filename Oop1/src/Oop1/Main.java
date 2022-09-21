package Oop1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mesaj="Selim Çınar";
		
		
		Product product1 = new Product(); //Sınıftan nesne oluşturduk
		//set value classtan türetilmiş objeye değer atadık
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		
		//Get getirme clastan oluşturulan obje yazdırıldı
		System.out.println(product1.getName());
		
		
		Product product2 = new Product();
		product2.setName("Delonghi Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.jpg");
		
		Product product3 = new Product(); 
		product3.setName("Delonghi Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image1.jpg");
		
		
		//Class sınıflardan dizi oluşturduk
       	Product[] products = {product1,product2,product3};
		
       	System.out.println("<ul>");
		for(Product product: products) {
			System.out.println(product.getName());
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setId(1);
		individualCustomer.setPhone("054546543546");
		individualCustomer.setCustomerNumber("12137");
		individualCustomer.setFirstName("Selim");
		individualCustomer.setLastName("Çınar");
		
		
		CorparateCustomer corprateCustomer = new CorparateCustomer();
		
		corprateCustomer.setId(2);
		corprateCustomer.setCompanyName("Çınar Marjet");
		corprateCustomer.setPhone("053435454")	;
		corprateCustomer.setTaxNumber("02846868");
		corprateCustomer.setCustomerNumber("545646");
		
		Customer []customers= {individualCustomer,corprateCustomer};

}
