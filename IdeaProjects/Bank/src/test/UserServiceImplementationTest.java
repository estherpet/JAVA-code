package test;

import dto.Request;
import org.junit.jupiter.api.Test;
import services.UserService;
import services.UserServiceImplementation;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplementationTest {

UserService userService = new UserServiceImplementation();
@Test
    public  void registerOneUser_CountIsOneTest(){
    Request register = new Request();
register.setUsername("maggi");
register.setPassword("olympic");
userService.register(register);
assertEquals(1,userService.numberOfUser());
  }
 @Test
   public void registerTwoUser_countIsTwoTest(){
     Request register = new Request();
  register.setUsername("dine");
   register.setPassword("kingsley");
     Request register1 = new Request();
  register1.setUsername("nam");
   register1.setPassword("meg");
   userService.register(register);
   userService.register(register1 );
   assertEquals(2,userService.numberOfUser());
  }
  @Test
    public  void duplicateUser_cannotregister_Test(){
    Request register = new Request();
    register.setUsername("divine");
    register.setPassword("pat");
    userService.register(register);
    Request register1 = new Request();
    register1.setUsername("divine");
    register1.setPassword("pat");
      assertThrows(IllegalArgumentException.class,()->userService.register(register1));
      assertEquals(1,userService.numberOfUser());
    try {
      userService.register(register1);
    }catch (Exception exception){
assertEquals("user already exist",exception.getMessage());
assertEquals(IllegalArgumentException.class,exception.getClass());
    }
    assertEquals(1,userService.numberOfUser());
  }
  @Test
  public void registerd_UserCanLoginTest(){
    Request register = new Request();
    register.setUsername("hillary");
    register.setPassword("peter");
  userService.register(register);
  userService.logIn(register);
  assertTrue(userService.isLoggedIn());
  }
  @Test
  public void registerdUser_canChangePassword(){
    Request register = new Request();
    register.setUsername("gabriel");
    register.setPassword("peter");
  userService.register(register);
  userService.logIn(register);
  register.setNewPassword("jonah");
  userService.changePassword(register);
  userService.logIn(register);
  assertTrue(userService.isLoggedIn());
  }


}