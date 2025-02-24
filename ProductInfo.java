public class ProductInfo {

    private String id;
    private String name;
    private double price;
    private int quantity;
    private String category;

    public ProductInfo(String name1, int qty, double price1, String ctgry) {
        this.name = name1;
        this.quantity = qty;
        this.price = price1;
        this.category = ctgry;
    }

    public void display() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Quantity: %d\n", quantity);
        System.out.printf("Price: %.2f\n", price);
        System.out.printf("Category: %s\n", category);
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double newPrice) {
        if (newPrice > 0) {
            this.price = newPrice;
        } else {
            System.out.println("The price cannot be negative.");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int newQuantity) {
        if (newQuantity >= 0) {
            this.quantity = newQuantity;
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }

    public String getCategory() {
        return category;
    }
}
  