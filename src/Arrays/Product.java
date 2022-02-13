package Arrays;

import java.util.Objects;

public class Product {
    String name;
    double prise;
    String about;
    Category category;

    public Product(String name, double prise, String about, Category category) {
        this.name = name;
        this.prise = prise;
        this.about = about;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                ", about='" + about + '\'' +
                ", category=" + category +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.prise, prise) == 0 && name.equals(product.name) && about.equals(product.about) && category == product.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, prise, about, category);
    }
}
