package services;

import dto.Request;

public interface UserService {
void  logIn(Request register);
void register(Request register);
void changePassword(Request register);
int numberOfUser();
boolean isLoggedIn();
}
