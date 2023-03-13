package Seminars.S12OOP.Example.service;

import Seminars.S12OOP.Example.model.User;

import java.io.FileWriter;
import java.util.logging.Logger;

public class UserServiceImpl implements UserService{
    Logger logger = Logger.getAnonymousLogger();
    @Override
    public void saveUser(User user) {
        try(FileWriter fileWriter = new FileWriter("user.txt")){
            fileWriter.write(user.toString());

        }catch (Exception e){
            logger.warning("Что-то пошло не так!");

        }

    }
}
