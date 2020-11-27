package Nyansapo.exchangeConnectivity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {

    private String product;
    private double quantity;
    private String side;
    private double price;
    @JsonProperty("baseURL")
    private String exchangePath;


    public Order(String product, double quantity, String side, double price) {
        this.product = product;
        this.quantity = quantity;
        this.side = side;
        this.price = price;
    }

    public Order(String product, double quantity, String side, double price, String exchange_path) {
        this.product = product;
        this.quantity = quantity;
        this.side = side;
        this.price = price;
        this.exchangePath = exchange_path;
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

    public String getExchangePath() {
        return exchangePath;
    }

    public void setExchangePath(String exchange_path){
        this.exchangePath = exchange_path;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
