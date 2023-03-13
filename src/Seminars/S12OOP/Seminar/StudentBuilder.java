package model;

public class StudentBuilder {
    public static StudentBuilder instance;
    public Student student;
    public static StudentBuilder getInstance() {
        instance = new StudentBuilder();
        instance.student = new Student();
        return instance;
    }
    public Student build(){
        return student;
    }
    public StudentBuilder setYearStudy(int yearStudy) {
        student.setYearStudy(yearStudy);
        return this;
    }

    public StudentBuilder setSpecialitySt(String specialitySt) {
        student.setSpecialitySt(specialitySt);
        return this;
    }
    public StudentBuilder setName(String name) {
        student.setName(name);
        return this;
    }
}
