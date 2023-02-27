package Seminars.S11OOP;
public class Worker {
    String name;
    int age;
    int salary;
    short kabinet;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setKabinet(short kabinet) {
        this.kabinet = kabinet;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", kabinet=" + kabinet +
                '}';
    }

}
