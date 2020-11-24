package Nyansapo.exchangeConnectivity;

public class Order {
    private String product;
    private double quantity;
    private String side;
    private double price;


    public Order(String product, double quantity, String side, double price) {
        this.product = product;
        this.quantity = quantity;
        this.side = side;
        this.price = price;
    }
    
    public Order(){ };

    public double getPrice() {
        return price;
    }

    public String getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getSide() {
        return side;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setProduct(String productName) {
        this.product = productName;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
