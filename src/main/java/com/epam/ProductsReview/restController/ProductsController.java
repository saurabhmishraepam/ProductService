package com.epam.ProductsReview.restController;

import com.epam.ProductsReview.entity.Product;
import com.epam.ProductsReview.entity.ProductRequestBean;
import com.epam.ProductsReview.exceptionHadlers.ProductsException;
import com.epam.ProductsReview.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by saurabh on 26/2/19.
 */
@RestController
@RequestMapping("/product")

public class ProductsController {

    @Autowired
    private ProductService productReviewService;

    @PostMapping
    public Product saveProducts(@RequestBody ProductRequestBean product) {
        System.out.println("products controller"+ product);

        Product product1=new Product();
        product1.setName(product.getName());
        product1.setCategory(product.getCategory());
       return  productReviewService.addProducts(product1);

    }
    @GetMapping
    public List<Product> getAllProducts(){
      return   productReviewService.getProducts();
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable("productId") Long productId){
        System.out.println(productId);
        return productReviewService.getProductById(productId);
    }


    @DeleteMapping("/{productId}")
    public void deleteProductById(@PathVariable("productId") Long productId){
        System.out.println(productId);
        productReviewService.deleteProductById(productId);
    }

    @PutMapping
    public Product updateProducts(@RequestBody ProductRequestBean product) {

        Product product1=new Product();
        product1.setName(product.getName());
        product1.setCategory(product.getCategory());
        return  productReviewService.addProducts(product1);

    }

}
