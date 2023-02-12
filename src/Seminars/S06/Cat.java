//1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является

//а) информационной системой ветеринарной клиники
//б) архивом выставки котов
//в) информационной системой Театра кошек Ю. Д. Куклачёва/
//Можно записать в текстовом виде, необязательно реализовывать в java.
//
package Seminars.S06;

import java.util.HashSet;
import java.util.Objects;

public class Cat {
    private int id;
    private String name;
    private int age;
    private String owner;
    private String breed;
    private HashSet<String> vaccinated;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && age == cat.age && Objects.equals(name, cat.name)
                && Objects.equals(owner, cat.owner) && Objects.equals(breed, cat.breed) && Objects.equals(vaccinated, cat.vaccinated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, owner, breed, vaccinated);
    }

    public Cat(int id, String name, int age, String owner, String breed, HashSet<String> vaccinated) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.breed = breed;
        this.vaccinated = vaccinated;
    }
    public Cat() {
    }
    public Cat(int id, String name, int age, String owner, HashSet<String> vaccinated){

    }
    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", owner='" + owner + '\'' +
                ", breed='" + breed + '\'' +
                ", vaccinated=" + vaccinated +
                '}';
    }

    //    public void printCat(){
//        System.out.printf("Name: %s \nAge: %d\nVacc: %s\n  Id: %d\n  Breed: %s\n", getName(), getAge(), getVaccinated(), getId(), getBreed());
//    }
    public Boolean isVacc(String vac){
        if (vaccinated.contains(vac)) return true;
        else return false;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public HashSet<String> getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(HashSet<String> vaccinated) {
        this.vaccinated = vaccinated;
    }
}