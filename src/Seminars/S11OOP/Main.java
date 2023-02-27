package Seminars.S11OOP;
public class Main {
    public static void main(String[] args) {
        Worker worker = WorkerBuilder.getInstance().setName("agr").builder();

        Worker worker1 = WorkerBuilder.getInstance().setName("degrh").setAge(234).builder();
        System.out.println(worker);
        System.out.println(worker1);


    }
}