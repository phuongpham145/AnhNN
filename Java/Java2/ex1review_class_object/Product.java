public class Product implements DAO {
    private String name;
    private float price;
    public Product() {
        name = "";
        price = 0;
    }
    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public Double getImportTax() {
        return price * 0.1;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPrice() {
        return this.price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public void insert() {
        System.out.println("Insert successfully !");
    }
    @Override
    public void update() {
        System.out.println("Update successfully !");
    }
    @Override
    public void delete() {
        System.out.println("Delete successfully !");
    }
    @Override
    public void select() {
        System.out.println("Select successfully !");
    }

}