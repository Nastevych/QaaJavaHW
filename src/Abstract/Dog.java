package Abstract;

public class Dog extends Animal{
    public Dog(String name, int age, String type, String gender) {
        super(name, age, type, gender);
    }

    @Override
    public String sleep(Animal animal) {
        String sleeping = String.format("I'm a %s and I'm sleeping", type);
        return sleeping;
    }

    @Override
    public String makeSound() {
        return "Woof-woof";
    }

    @Override
    public String eat() {
        return "Bones";
    }
}
