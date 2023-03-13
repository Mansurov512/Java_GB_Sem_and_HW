package service;

import model.Student;
import model.Teacher;
import model.User;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class UserServiceImpl implements UserService{
    Logger logger = Logger.getAnonymousLogger();
    @Override
    public void saveUser(Student stud) {
        try(FileWriter fileWriter = new FileWriter("user.txt")){
            fileWriter.write(stud.toString());

        }catch (Exception e){
            logger.warning("Что-то пошло не так!");

        }

    }
    public void saveUser(Teacher teacher) {
        try(FileWriter fileWriter = new FileWriter("user.txt")){
            fileWriter.write(teacher.toString());

        }catch (Exception e){
            logger.warning("Что-то пошло не так!");

        }

    }
    public void getUser() {
        try(FileReader fileReader = new FileReader("user.txt")){
            int c;
            while((c=fileReader.read())!=-1){

                System.out.print((char)c);
            }

        }catch (Exception e){
            logger.warning("Что-то пошло не так!");

        }

    }
}
