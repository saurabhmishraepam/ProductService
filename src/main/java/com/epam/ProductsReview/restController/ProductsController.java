package com.epam.ProductsReview.restController;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.ProductsReview.entity.Product;
import com.epam.ProductsReview.entity.ProductRequestBean;
import com.epam.ProductsReview.service.ProductService;

/**
 * Created by saurabh on 26/2/19.
 */
@RestController
@RequestMapping("/product")

public class ProductsController {

	@Autowired
	private ProductService productReviewService;

	@PostMapping
	public Product saveProducts(@Valid @RequestBody ProductRequestBean product) {

		Product product1 = new Product();
		product1.setName(product.getName());
		product1.setCategory(product.getCategory());
		return productReviewService.addProducts(product1);

	}

	@GetMapping
	public List<Product> getAllProducts() {
		return productReviewService.getProducts();
	}

	@GetMapping("/{productId}")
	public Product getProductById(@PathVariable("productId") @Min(2) Long productId) {
		return productReviewService.getProductById(productId);
	}

	@DeleteMapping("/{productId}")
	public void deleteProductById(@PathVariable("productId") @Min(2) Long productId) {
		productReviewService.deleteProductById(productId);
	}

	@PutMapping
	public Product updateProducts(@Valid @RequestBody ProductRequestBean product) {

		Product product1 = new Product();
		product1.setName(product.getName());
		product1.setCategory(product.getCategory());
		return productReviewService.addProducts(product1);

	}

}
