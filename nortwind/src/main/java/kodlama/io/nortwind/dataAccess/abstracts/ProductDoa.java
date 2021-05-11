package kodlama.io.nortwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.nortwind.entities.concretes.Product;

public interface ProductDoa extends JpaRepository<Product,Integer> {

}
