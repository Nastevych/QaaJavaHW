package Stream;

import Arrays.Category;
import Arrays.Product;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MailStream extends Product {


    public MailStream(String name, double prise, String about, Category category) {
        super(name, prise, about, category);
    }

    public static void main(String[] args) {
        Product barbe = new Product("Lola", 18.5, "For girls", Category.Toy);
        Product train = new Product("Forest-09", 5.3, "For boys", Category.Toy);
        Product pen = new Product("Parker", 74, "For Men", Category.Office);
        Product table = new Product("Diner", 69.3, "For everyone", Category.Furniture);
        Product chair = new Product("Diner", 14.3, "For everyone", Category.Furniture);
        Product statue = new Product("Venera", 125, "For everyone", Category.Garden);
        //Сложить в список
        List <Product> allProducts = new LinkedList<>();
        allProducts.add(barbe);
        allProducts.add(train);
        allProducts.add(pen);
        allProducts.add(table);
        allProducts.add(chair);
        allProducts.add(statue);

        List<Product> all = allProducts.stream().collect(Collectors.toList());
        System.out.println("All products: " + all);

        //Разложить в три новых массива по категориям
        List<Product> allToys = all.stream().filter(e -> e.getCategory().equals(Category.Toy)).collect(Collectors.toList());
        System.out.println("All toys: " + allToys);

        List<Product> allOffice = all.stream().filter(e -> e.getCategory().equals(Category.Office)).collect(Collectors.toList());
        System.out.println("All office: " + allOffice);

        List<Product> allGarden = all.stream().filter(e -> e.getCategory().equals(Category.Garden)).collect(Collectors.toList());
        System.out.println("All garden: " + allGarden);
        // Посчитать количество продуктов с ценой выше 50
        long priceMore50 = all.stream().filter(e -> e.getPrise() > 50).count();
        System.out.println("Products wit price more than 50: " + priceMore50);
        // Посчитать количество объектов которые имеют "everyone" в описании
        long containsEveryone = all.stream().filter(e -> e.getAbout().contains("everyone")).count();
        System.out.println("Count of products that contains 'everyone': " + containsEveryone);

    }

}
