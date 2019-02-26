package com.epam.ProductsReview.exceptionHadlers;

import org.springframework.stereotype.Component;

/**
 * Created by saurabh on 26/2/19.
 */
public class ProductsException extends RuntimeException{

    public ProductsException(String excepionDetails){
        super(excepionDetails);
    }
}
