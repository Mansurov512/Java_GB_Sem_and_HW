package model;

public class Teacher extends User{
    String specialityT;
    int experience;

    public void setSpecialityT(String specialityT) {
        this.specialityT = specialityT;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", specialityT='" + specialityT + '\'' +
                ", experience=" + experience +
                '}';
    }
}
