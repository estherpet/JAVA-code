package org.example.services;

import org.example.data.repositories.UserRepositories;
import org.example.data.repositories.mocks.FirstRegisterRepo;
import org.junit.jupiter.api.Test;

public class SellerServiceMockTest {
    private UserRepositories userRepositories;
    private  SellerServices sellerServices;
    @Test
    public  void registerSellerTest(){
        userRepositories =new FirstRegisterRepo();
        sellerServices = new SellerServicesImpl();
    }
}
