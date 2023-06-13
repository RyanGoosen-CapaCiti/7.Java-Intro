import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Store> storeList;

    public Company(String name){
        this.name = name;
        this.storeList = new ArrayList<>();
    }

    public void addStore(Store store) {
        storeList.add(store);
    }

    public List<Store> getStoreList(){
        return storeList;
    }
}
