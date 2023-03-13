package model;

public class TeacherBuilder {
    public static TeacherBuilder instance;
    public Teacher teacher;
    public static TeacherBuilder getInstance() {
        instance = new TeacherBuilder();
        instance.teacher = new Teacher();
        return instance;
    }
    public Teacher build(){
        return teacher;
    }
    public TeacherBuilder setExperience(int yearStudy) {
        teacher.setExperience(yearStudy);
        return this;
    }

    public TeacherBuilder setSpecialityT(String specialitySt) {
        teacher.setSpecialityT(specialitySt);
        return this;
    }
    public TeacherBuilder setName(String name) {
        teacher.setName(name);
        return this;
    }
}
