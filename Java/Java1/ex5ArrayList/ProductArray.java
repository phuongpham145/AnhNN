public class ProductArray {
    private String name;
    private double price;
    public ProductArray(){
        this.name = null;
        this.price = 0.0;
    }
    public ProductArray(String name, double price){
        this.name = name;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setPrice(double price) {
        this.price= price;
    }
    public double getPrice() {
        return this.price;
    }
    
}
