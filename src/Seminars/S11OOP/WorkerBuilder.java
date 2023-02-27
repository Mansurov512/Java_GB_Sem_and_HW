package Seminars.S11OOP;
public class WorkerBuilder {
    public static WorkerBuilder sirena;
    public Worker id;

    public static WorkerBuilder getInstance() {
       // if (sirena == null) {
            sirena = new WorkerBuilder();
            sirena.id = new Worker();
        //}
        return sirena;
    }

    public WorkerBuilder setName(String name) {
        id.setName(name);
        return this;
    }

    public WorkerBuilder setAge(int age) {
        id.setAge(age);
        return this;
    }

    public WorkerBuilder setSalary(int salary) {
        id.setSalary(salary);
        return this;
    }

    public WorkerBuilder setKabinet(short kabinet) {
        id.setKabinet(kabinet);
        return this;
    }

    public Worker builder(){
        return id;
    }

    @Override
    public String toString() {
        return "WorkerBuilder{" +
                "id=" + id +
                '}';
    }

}
