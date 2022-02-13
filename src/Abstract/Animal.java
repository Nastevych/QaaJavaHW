package Abstract;

import java.util.Objects;

public abstract class Animal {
    String name;
    int age;
    String type;
    String  gender;


    public Animal(String name, int age, String type, String gender) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                '}';
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && name.equals(animal.name) && type.equals(animal.type) && gender.equals(animal.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, type, gender);
    }

    public abstract String sleep (Animal animal);
    public abstract String makeSound();
    public abstract String eat();

}
