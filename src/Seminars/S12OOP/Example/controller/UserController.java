package Seminars.S12OOP.Example.controller;

import Seminars.S12OOP.Example.model.User;
import Seminars.S12OOP.Example.service.UserService;
import Seminars.S12OOP.Example.service.UserServiceImpl;

public class UserController {
    private UserService service = new UserServiceImpl();
    public void saveUser(String name){
        service.saveUser(new User(name));


    }
}
