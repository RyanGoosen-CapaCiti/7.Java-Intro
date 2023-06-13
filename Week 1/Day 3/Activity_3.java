import java.util.ArrayList;
import java.util.List;

public class Activity_3{
    public static void main(String[] args){
        Company company = new Company("Fruits Inc");

        Store store2 = new Store("Fruit and Veg", "Paarl");

        Product productA = new Product("Apples", 500, 10);
        Product productB = new Product("Oranges", 250, 15);

        store2.addProduct(productA);
        store2.addProduct(productB);

        Store store1 = new Store("Veggies United", "Wellington");

        Product productC = new Product("Tomatoes", 500, 12);
        Product productD = new Product("Carrots", 250, 10);

        store1.addProduct(productC);
        store1.addProduct(productD);

        company.addStore(store1);
        company.addStore(store2);


        List<Store> stores = company.getStoreList();
        for (Store store: stores) {
            System.out.println("The store " + store.getName() + " is located at " + store.getLocation());
            System.out.println("They sell the following products: ");

            List<Product> products = store2.getProductList();
            for (Product product : products) {
                System.out.println("Product Name:\tProduct Quality:\tProduct Price:" );
                System.out.println(product.getName()+"\t\t"+product.getQuantity()+"\t\t\t"+product.getPrice());
            }
            System.out.println(); 
        }
    }
}