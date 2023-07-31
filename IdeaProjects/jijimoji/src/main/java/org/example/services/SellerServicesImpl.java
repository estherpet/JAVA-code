package org.example.services;

import org.example.data.models.Product;
import org.example.data.repositories.ProductRepository;
import org.example.dtos.request.PostProductRequest;
import org.example.dtos.responses.PostProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServicesImpl implements SellerServices{
    @Autowired
private ProductRepository productRepository;
    @Override
    public PostProductResponse postProduct(PostProductRequest postProductRequest) {
        Product product = new Product();
        product.setName(postProductRequest.getName());
        product.setDescription(postProductRequest.getDescription());
        product.setPrice(postProductRequest.getPrice());
      Product savedProduct =   productRepository.save(product);


        PostProductResponse response = new PostProductResponse();
        response.setId(savedProduct.getId());
        response.setName(savedProduct.getName());

        return response;
    }
}
