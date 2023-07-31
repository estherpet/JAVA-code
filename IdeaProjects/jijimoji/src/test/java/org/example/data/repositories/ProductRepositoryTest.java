package org.example.data.repositories;
import org.example.data.models.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import static org.hamcrest.MatcherAssert.assertThat;
import  static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;


@DataMongoTest
public class ProductRepositoryTest {

   @Autowired
    private ProductRepository productRepository;

   @Test
   public void saveTest (){
       Product product = new Product();
       Product savedProduct = productRepository.save(product);
       assertThat(productRepository.count(), is(1L));
       assertNotNull(savedProduct.getId());
   }

}