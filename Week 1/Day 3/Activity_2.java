public class Activity_2 {
    private String name;
    private double unitPrice;
    private double weight;
    private int quantity;

    public Activity_2(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public Activity_2() {
        this.name = "no item";
        this.unitPrice = 0;
    }

    public double getPrice() {
        return unitPrice;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeightedPrice() {
        return getPrice() * weight;
    }

    public double getCountedPrice() {
        return getPrice() * quantity;
    }
    // Banana @ 3.00 1.37 Kg R4.11 (in case of WeighedItem class)

    // Pens @ 4.5 10 units R45 (in case of CountedItem class)
    public static void main(String[] args) {
        Activity_2 purchaseItem1 = new Activity_2("Banana", 3.00);
        purchaseItem1.setWeight(1.37);
        System.out.println(purchaseItem1.name + " @ " + purchaseItem1.getPrice() + " " + purchaseItem1.weight +" Kg R"+  + purchaseItem1.getWeightedPrice());

        Activity_2 purchaseItem2 = new Activity_2("Pens", 4.5);
        purchaseItem2.setQuantity(10);
        System.out.println(purchaseItem2.name + " @ " + purchaseItem2.getPrice() + " " + purchaseItem2.quantity +" units Kg R"+ purchaseItem2.getCountedPrice());
    }
}
