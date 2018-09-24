package com.yash.loginec2server.service;

import com.yash.loginec2server.command.UserCommand;
import com.yash.loginec2server.domain.User;

public interface UserService {

    User login(UserCommand userCommand);

}
