package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.response.GetAllBrandsResponse;


public interface BrandService {
	
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);
	
	
	
}
