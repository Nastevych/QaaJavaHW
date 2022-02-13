package Abstract;

public class Coala extends Animal{
    public Coala(String name, int age, String type, String gender) {
        super(name, age, type, gender);
    }

    @Override
    public String sleep(Animal animal) {
        String sleeping = String.format("I'm a %s and I'm sleeping", type);
        return sleeping;
    }

    @Override
    public String makeSound() {
        return "Huh?";
    }

    @Override
    public String eat() {
        return "Leaves";
    }
}
