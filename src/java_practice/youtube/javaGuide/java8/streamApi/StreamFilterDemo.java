package java_practice.youtube.javaGuide.java8.streamApi;

import java_practice.coding.ashishPdf.SwapNumbers;

import java.util.ArrayList;
import java.util.List;

public class StreamFilterDemo {
    
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        for(Product product: getProducts()){
            if(product.getPrice() > 22000f){
                list.add(product);
            }
        }
        list.forEach(System.out::println);

        getProducts().stream().filter(p-> p.getPrice()>22000f).forEach(System.out::println);


    }


    public static List<Product> getProducts(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "HP", 25000f));
        productList.add(new Product(2, "Lenovo", 24000f));
        productList.add(new Product(3, "Dell", 22000f));
        productList.add(new Product(4, "MacBook", 49000f));
        productList.add(new Product(5, "Asus", 23000f));

        return productList;
    }
}

class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
