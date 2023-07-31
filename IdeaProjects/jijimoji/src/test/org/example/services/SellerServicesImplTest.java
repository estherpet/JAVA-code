package org.example.services;

import org.example.data.repositories.ProductRepository;
import org.example.dtos.request.PostProductRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@DataMongoTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestConfig.class)
class SellerServicesImplTest {
    @Autowired
    private  SellerServices sellerServices;
    @Autowired
    private ProductRepository productRepository;
    @Test
    public  void addProductTest(){
        PostProductRequest request = new PostProductRequest();
        request.setDescription("dan laptop");
        request.setName("laptop");
        request.setPrice(2000);
        sellerServices.postProduct(request);
        assertThat(productRepository.count(),is(1L));
        assertThat(productRepository.findAll().get(0).getName(),is("laptop"));

    }
    @Test
    public  void addProductResponseTest(){
        PostProductRequest request = new PostProductRequest();
        request.setDescription("dan laptop");
        request.setName("laptop");
        request.setPrice(2000);
       var response =  sellerServices.postProduct(request);
        assertThat(productRepository.count(),is(1L));
        assertThat(productRepository.findAll().get(0).getName(),is("laptop"));
         assertNotNull(response.getId());
    }
}