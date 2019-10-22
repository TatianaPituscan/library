package ro.library.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ro.library.library.entities.AuthenticatedUser;
import ro.library.library.entities.RegisterUser;
import ro.library.library.entities.User;
import ro.library.library.service.UserService;

@RestController
public class AuthenticationController {
    @Autowired
    private UserService userService;

    @PostMapping("/users/authenticate")
    public AuthenticatedUser login(@RequestBody User user) {
        this.validateLoginData(user);
        return this.userService.AuthenticateUser(user);
    }

    @PostMapping("/users/register")
    public RegisterUser registerNewUser(@RequestBody User user) {
        this.validateRegisterUserData(user);
        RegisterUser response = new RegisterUser();
        response.setSuccess(this.userService.registerNewUser(user));
        return response;
    }

    private void validateLoginData(User user) {
        if (StringUtils.isEmpty(user.getUsername())) {
            throw new RuntimeException("user name cannot be empty");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            throw new RuntimeException("Password cannot be empty");
        }
    }

    private void validateRegisterUserData(User user) {
        if (StringUtils.isEmpty(user.getUsername())) {
            throw new RuntimeException("Username cannot be empty");
        }
        if (StringUtils.isEmpty(user.getPassword())) {
            throw new RuntimeException("password cannot be empty");
        }
    }
}
