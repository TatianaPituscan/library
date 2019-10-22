package ro.library.library.service;

import ro.library.library.entities.AuthenticatedUser;
import ro.library.library.entities.User;
import ro.library.library.entities.RegisterUser;


public interface UserService {

       AuthenticatedUser AuthenticateUser(User user);
       User getUserDetails(String phone);

       RegisterUser registerNewUser(User user);
}
