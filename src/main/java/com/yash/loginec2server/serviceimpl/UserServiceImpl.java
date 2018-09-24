package com.yash.loginec2server.serviceimpl;

import com.yash.loginec2server.command.UserCommand;
import com.yash.loginec2server.domain.User;
import com.yash.loginec2server.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    User user = new User(1, "Justin", "judilks@gmail.com", "626yjjiz");

    @Override
    public User login(UserCommand userCommand) {
        if(userCommand.getEmail().equals(user.getEmail()) && userCommand.getPassword().equals(user.getPassword()))
            return user;
        return null;
    }
}
