package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.entities.concretes.Brand;

@RestController  //annotation restcontoller burada diyor spring framework
@RequestMapping("/api/brands")  // İstek merkezi webe bunu yaz ve buradan bağlan
public class BrandsController {
	private BrandService brandService ; //Brandservice bağlantısı yapıldı

	@Autowired  
	public BrandsController(BrandService brandService) { 
		this.brandService = brandService;    // Brands  controller üzerinden bağlantı sağlandı
	}
	@GetMapping("/getall") // webe bunuda ekle ve çalıştır
	public List<Brand> getAll(){
		return brandService.getAll();  // Liste üzerinden bağlantı alınıp return ile yazdırıldı
	}
	
}
