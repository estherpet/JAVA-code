package services;

import data.models.User;
import data.repositories.UserRepositories;
import data.repositories.UserRepositoriesImpementation;
import dto.Request;

public class UserServiceImplementation implements  UserService{
    private UserRepositories userRepositories = new UserRepositoriesImpementation();
    private boolean isLoggedIn = true;

    @Override
    public void logIn(Request registerDto) {
        User user = userRepositories.findByUsername(registerDto.getUsername());
     userExist(registerDto.getUsername());
        if (user.getPassword().equals(registerDto.getPassword()))isLoggedIn = true;

    }

    @Override
    public void register(Request registerDto) {
        validate(registerDto.getUsername());
        User user = new User();
        user.setUsername(registerDto.getUsername());
        user.setPassword(registerDto.getPassword());
        userRepositories.save(user);

    }
    public void validate(String username){
        if (userExist(username))throw new IllegalArgumentException("user already exist");
    }
    private boolean userExist(String username) {
        User user = userRepositories.findByUsername(username);
         if (user == null) return false;
         return true;
    }
    @Override
    public void changePassword(Request registerDto) {
        User user = userRepositories.findByUsername(registerDto.getUsername());
        userExist(registerDto.getUsername());
        if (user.getPassword().equals(registerDto.getOldPassword())) user.setPassword(registerDto.getNewPassword());

    }
    @Override
    public int numberOfUser() {
        return (int) userRepositories.count();
    }

    @Override
    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}
