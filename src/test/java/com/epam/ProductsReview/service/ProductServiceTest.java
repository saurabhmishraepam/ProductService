package com.epam.ProductsReview.service;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import com.epam.ProductsReview.entity.Product;
import com.epam.ProductsReview.repository.ProductsRepository;

/**
 * Created by saurabh on 26/2/19.
 */

@RunWith(MockitoJUnitRunner.class)

public class ProductServiceTest {
	
	@InjectMocks
	ProductService productService;
	@Mock
	ProductsRepository productsRepository;
	@Rule
	ExpectedException exception=ExpectedException.none();
	@Before
	public void init() {
		//prepare this	
	}
	@Test
	public void shouldInsertProducts() {
		Product product=new Product();
		when(productsRepository.save(any(Product.class))).thenReturn(product);
		product.setName("product1");
		product.setCategory("cat1");
		product.setPrice(12.00f);
		assertEquals(product, productService.addProducts(product));
	}
	
	@Test
	public void shouldFailToInsertProductsWhenRepositoryThrowsException() {
		Product product=new Product();
		when(productsRepository.save(any(Product.class))).thenThrow(new Exception("Bad input") );
		product.setName("product1");
		product.setCategory("cat1");
		product.setPrice(12.00f);
		assertEquals(product, productService.addProducts(product));
	}
	
}
