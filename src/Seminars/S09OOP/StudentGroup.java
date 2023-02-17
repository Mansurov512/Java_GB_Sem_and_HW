package Seminars.S09OOP;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentGroup implements Iterable<Student>
{
    private ArrayList<Student> groupList = new ArrayList<>();

    public ArrayList<Student> getGroupList()
    {
        return groupList;
    }
//    public StudentGroup(groupList)
//    {
//
//    }

    public StudentGroup addToList(Student student)
    {
        groupList.add(student);
        return this;
    }

    public void setGroupList(ArrayList<Student> groupList)
    {
        this.groupList = groupList;
    }

    @Override
    public Iterator<Student> iterator()
    {
        return new StudentIterator(this);
    }

}
