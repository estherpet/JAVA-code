package org.example.services;

import org.example.dtos.request.PostProductRequest;
import org.example.dtos.responses.PostProductResponse;

public interface SellerServices {
    PostProductResponse postProduct(PostProductRequest postProductRequest);
}
