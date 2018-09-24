package com.yash.loginec2server.controller;

import com.yash.loginec2server.command.UserCommand;
import com.yash.loginec2server.domain.User;
import com.yash.loginec2server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(@RequestParam("email") String email, @RequestParam("password") String password) {
        UserCommand userCommand = new UserCommand(email, password);
        User user = userService.login(userCommand);
        if(user !=null)
            return user;
        else

            return "{text: 'No such user exists'}";
    }

}
