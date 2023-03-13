package model;

import view.InputData;

public class Student extends User {
    int yearStudy;
    String specialitySt;

    public void setYearStudy(int yearStudy) {
        this.yearStudy = yearStudy;
    }

    public void setSpecialitySt(String specialitySt) {
        this.specialitySt = specialitySt;
    }

    public int getYearStudy() {
        return yearStudy;
    }

    public String getSpecialitySt() {
        return specialitySt;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", yearStudy=" + yearStudy +
                ", specialitySt='" + specialitySt + '\'' +
                '}';
    }
}
