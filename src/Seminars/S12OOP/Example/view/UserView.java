package Seminars.S12OOP.Example.view;

import Seminars.S12OOP.Example.controller.UserController;

public class UserView {
    public static void main(String[] args) {
        UserController controller = new UserController();
        controller.saveUser("Roman");
    }
}
