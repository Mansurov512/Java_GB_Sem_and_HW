package service;

import model.Student;
import model.Teacher;
import model.User;

public interface UserService {
    void saveUser(Student stud);
    void saveUser(Teacher teach);

    default void getUser() {

    }

}
