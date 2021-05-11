package kodlama.io.nortwind.business.concretes;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlama.io.nortwind.business.abstracts.ProductService;
import kodlama.io.nortwind.dataAccess.abstracts.ProductDoa;
import kodlama.io.nortwind.entities.concretes.Product;

public class ProductManager implements ProductService {
private ProductManager(ProductDao productDao) {
	
}
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
