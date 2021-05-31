package kodlama.io.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlama.io.northwind.entities.concretes.Product;
import kodlama.io.northwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByCategoryIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);

	List<Product> getByProductNameStartsWith(String productName);
	
	
	// JPQL
	
	// : parametreden geldiğini belirtmek için
	@Query("From Product where productName = :productName and category.categoryId= :categoryId")
	List<Product> getByProductNameAndCategory1(String productName, int categoryId);
	
	// select * from products where product_name = ... and categoryId=...
	  
	@Query("Select new kodlama.io.northwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName, c.categoryName) From Category c Inner JOin c.products p ")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
	
	
}
