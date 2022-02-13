package Abstract;

import com.calculatorNastevychQaa.Calculator;

public class MainAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Bob", 3, "Pet", "M");
        Dog dog = new Dog("Wofy", 6, "Pet", "M");
        Coala coala = new Coala("Lily", 1, "wild", "F");

        String catGender = cat.getGender();
        String dogGenger = dog.getGender();
        System.out.println("Is Dog and Cat same gender? " + catGender.equals(dogGenger));
    }
}
