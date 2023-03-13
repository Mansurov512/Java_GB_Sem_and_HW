package view;

import controller.UserController;
import model.Student;
import model.StudentBuilder;
import model.Teacher;
import model.TeacherBuilder;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int x = sc.nextInt();

        UserController controller = new UserController();
        Student stud = StudentBuilder.getInstance().setName(a).setYearStudy(x).setSpecialitySt(a).build();
        controller.saveUser(stud);
//        Teacher teacher = TeacherBuilder.getInstance().setName("AndreyKa").setSpecialityT("geeorraf").setExperience(10).build();
//        controller.saveUser(teacher);
        controller.getUser();


    }
}
//1. Создать абстрактный класс User с наследниками Student и Teacher
//2. Создать слой Service с реализациями. Добавить методы, позволяющие добавить и получить пользователей
//3. Создать слой контроллеров с методами, которые будут вызывать сервис для соответствующих операций
//4. Сымитировать пользовательский ввод во view