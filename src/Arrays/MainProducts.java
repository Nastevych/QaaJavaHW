package Arrays;

import java.util.Arrays;

public class MainProducts extends Product {
    public MainProducts(String name, double prise, String about, Category category) {
        super(name, prise, about, category);
    }
    public static void main(String[] args) {
    Product barbe = new Product("Lola", 18.5, "For girls", Category.Toy);
    Product train = new Product("Forest-09", 5.3, "For boys", Category.Toy);
    Product pen = new Product("Parker", 74, "For Men", Category.Office);
    Product table = new Product("Diner", 69.3, "For everyone", Category.Furniture);
    Product chair = new Product("Diner", 14.3, "For everyone", Category.Furniture);
    Product statue = new Product("Venera", 125, "For everyone", Category.Garden);

    //Сложить в массив
    Product [] allProducts = {barbe, train, pen, table, chair, statue};
    System.out.println("All products" + Arrays.toString(allProducts));

     Product [] allToy = new Product[allProducts.length];
     Product [] allOffice = new Product[allProducts.length];
     Product [] allGarden = new Product[allProducts.length];
     int priceMore50 = 0;
     int inName = 0;
     for (int i = 0; i < allProducts.length; i++){
         //Разложить в три новых массива по категориям
         if (allProducts[i].getCategory().equals(Category.Toy)){
            allToy[i] = allProducts [i];
         }
         if (allProducts[i].getCategory().equals(Category.Office)) {
            allOffice[i] = allProducts[i];
         }
         if (allProducts[i].getCategory().equals(Category.Garden)){
            allGarden[i] = allProducts[i];
         }
         // Посчитать количество продуктов с ценой выше 50
         if (allProducts[i].getPrise() > 50){
            priceMore50 = priceMore50 +1;
         }
         // Посчитать количество объектов которые имеют "everyone" в описании
         if (allProducts[i].getAbout().matches("(.*)everyone(.*)")){
             inName = inName + 1;
         }
     }
     System.out.println("All toys: " + Arrays.toString(allToy));
     System.out.println("All office: " + Arrays.toString(allOffice));
     System.out.println("All garden: " + Arrays.toString(allGarden));
     System.out.println("Price more than 50: " + priceMore50);
     System.out.println("About contains 'everyone': " + inName);

    }
}
