package Seminars.S09OOP;

//реализовать приложение, позволяющее добавлять, удалять и выводить печать студентов
//возможность вывода студентов со средним баллом выше 3.96
//реализовать всю логику итерирования и компарации
public class Main
{
    public static void main(String[] args)
    {
        Student stud01 = new Student("Mikhail", "Mansurov", 4);
        Student stud02 = new Student("Ivan", "Ivanov", 3.5f);
        Student stud03 = new Student("Petr", "Petrov", 5);
        Student stud04 = new Student("Sam", "Petrov", 4.3f);
        Student stud05 = new Student("Don", "Petrov", 4.2f);

        StudentGroup group1166 = new StudentGroup();
        group1166.addToList(stud01).addToList(stud02).addToList(stud03).addToList(stud04).addToList(stud05);
        StudentIterator iterrr = new StudentIterator(group1166);
        while (iterrr.hasNext())
        {
            System.out.println(iterrr.next());
        }







    }
}
