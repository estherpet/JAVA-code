package test;

import data.models.User;
import data.repositories.UserRepositories;
import data.repositories.UserRepositoriesImpementation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoriesImpementationTest {
    UserRepositories userRepositories = new UserRepositoriesImpementation();

@Test
    public void saveOneUser_CountIsOneTest(){
    User user = new User();
    userRepositories.save(user);
    assertEquals(1,userRepositories.count());
   }
   @Test
    public  void saveTwoUser_CountIsTwoTwoTest(){
    User user = new User();
    User user1 = new User();
    userRepositories.save(user);
    userRepositories.save(user1);
    assertEquals(2,userRepositories.count());
   }
   @Test
    public void saveTwoUser_DeleteOneTest(){
    User user = new User();
    User user1 = new User();
    userRepositories.save(user);
    userRepositories.save(user1);
    userRepositories.delete(1);
    assertEquals(1,userRepositories.count());
   }
   @Test
    public void saveTwoUser_DeleteAllTest(){
       User user = new User();
       User user1 = new User();
       userRepositories.save(user);
       userRepositories.save(user1);
       userRepositories.deleteAll();
       assertEquals(0,userRepositories.count());
   }
   @Test
    public void saveTwoUser_findbyIdTest(){
    User user = new User();
    User user1 = new User();
    userRepositories.save(user);
    userRepositories.save(user1);
    assertSame(user,userRepositories.findById(1));
   }
   @Test
    public void saveUser_findAllTest(){
       User user = new User();
       User user1 = new User();
       userRepositories.save(user);
       userRepositories.save(user1);
       for (int index = 0; index < userRepositories.findAll().size(); index++) {
           assertTrue(userRepositories.findAll().contains(user));
           assertTrue(userRepositories.findAll().contains(user1));
       }
   }

}