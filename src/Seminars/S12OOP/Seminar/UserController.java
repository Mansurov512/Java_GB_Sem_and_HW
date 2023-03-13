package controller;

import model.Student;
import model.Teacher;
import model.User;
import service.UserService;
import service.UserServiceImpl;

public class UserController <T extends User> {
    private UserService service = new UserServiceImpl();


    public void saveUser(Student stud){
        service.saveUser(stud);
    }
    public void saveUser(Teacher teacher){
        service.saveUser(teacher);
    }
    public void getUser(){
        service.getUser();
    }

}
