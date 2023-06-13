import java.util.ArrayList;
import java.util.List;

public class Store {
/*Name, location,product list */    
    private String name;
    private String location;
    private List<Product> product_list;

    public Store(String name, String location){
        this.name = name;
        this.location = location;
        this.product_list = new ArrayList<>();
    }

    public void addProduct(Product producte){
        product_list.add(producte);
    }

    public List<Product> getProductList(){
        return product_list;
    }

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }
}

