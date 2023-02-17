package Seminars.S09OOP;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student>
{
    private int counter;
    private final List<Student> students;
    public StudentIterator (StudentGroup studentGroup)
    {
        this.counter = 0;
        this.students = studentGroup.getGroupList();
    }

    @Override
    public boolean hasNext()
    {
        return counter < students.size() - 1;
    }

    @Override
    public Student next()
    {
        counter++;
        return students.get(counter);
    }
}
