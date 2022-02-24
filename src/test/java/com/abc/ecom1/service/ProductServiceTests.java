package com.abc.ecom1.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.abc.ecom1.entity.Product;
import com.abc.ecom1.exception.ProductNotFoundException;
import com.abc.ecom1.repository.ProductRepository;

@SpringBootTest
public class ProductServiceTests {
	
	@InjectMocks
private ProductService productService = new ProductServiceImpl();
	
	@Mock
	private ProductRepository productRepository;
	
	/*@Test
	public void testSaveProduct() {
		
		Product product = new Product();
		
		product.setProductId(0);
		product.setProductName("dummyname");
		product.setProductPrice(11232);
		product.setCreatedOn(LocalDate.of(2000, 01, 01));
		product.setProductCategory("dummy");
		
		Optional<Product> optionalProduct = Optional.of(product);
		int productId = 1;
		
		when(productRepository.findById(1)).thenReturn(optionalProduct);
		
		Product existingProduct = productService.getProductById(productId);
		
		assertEquals(product.getProductId(),existingProduct.getProductId());
		assertEquals(product.getProductCategory(),existingProduct.getProductCategory());
		assertEquals(product.getProductPrice(),existingProduct.getProductPrice());
		assertEquals(product.getCreatedAt(),existingProduct.getCreatedAt());
		assertEquals(product.getProductName(),existingProduct.getProductName());
	}*/
	
	@Test
    public void testGetProductByIdNotFound() 	{
	
		int productId = 200;       

        when(productRepository.findById(productId)).thenThrow(ProductNotFoundException.class);

        assertThrows(ProductNotFoundException.class,()->productService.getProductById(productId));
	}​​​​​​​
    @Test
    public void testSaveProduct() {

    Product product = new Product();
    product.setProductId(10);
    product.setProductName("dummyname");
    product.setProductPrice(11111);
    product.setCreatedOn(LocalDate.of(2000, 10, 10));
    product.setProductCategory("dummy");   

    when(productRepository.save(product)).thenReturn(product);

    Product newProduct = productService.saveProduct(product);

    //assertEquals(product.getProductName(), newProduct.getProductName());

    verify(productRepository,times(1)).save(product);       

}
	[12:18 PM] prasad (Guest)
	@Test

	    public void deleteProductById() {​​​​​​​

	        int productId = 222;

	        Product product = new Product();

	        product.setProductId(222);

	        product.setProductName("dummyname");

	        product.setProductPrice(11111);

	        product.setCreateOn(LocalDate.of(2000, 10, 10));

	        product.setProductCategory("dummy");

	        Optional<Product> optionalProduct = Optional.of(product);

	        when(productRepository.findById(222)).thenReturn(optionalProduct);   

	        productService.deleteProduct(product.getProductId());

	        verify(productRepository,times(1)).deleteById(productId);   

	        //doNothing().when(productRepository).deleteById(product.getProductId());

	    }​​​​​​​

	@Test

	    public void testSaveProduct() {​​​​​​​

	        Product product = new Product();

	        product.setProductId(10);

	        product.setProductName("dummyname");

	        product.setProductPrice(11111);

	        product.setCreateOn(LocalDate.of(2000, 10, 10));

	        product.setProductCategory("dummy");   

	        when(productRepository.save(product)).thenReturn(product);

	        Product newProduct = productService.saveProduct(product);

	        //assertEquals(product.getProductName(), newProduct.getProductName());

	        verify(productRepository,times(1)).save(product);       

	    }​​​​​​​


	