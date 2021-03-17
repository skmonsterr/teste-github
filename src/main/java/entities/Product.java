package entities;

/**
 *
 * @author SkM
 */
public class Product {
    
    private String name;
    private double price;
    private int quantity;
    
    //CONSTRUCTOR
    
    public Product( String name, double price, int quantity ){
        super();        
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    
    // GETTERS & SETTERS
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    // FUNCTIONS
    
    public double totalValueInStock(){
        return price * quantity;
    }
    
    public void addProducts ( int quantity ){
        this.quantity += quantity;
    }
    
    public void removeProducts ( int quantity ){
        this.quantity -= quantity;
    }
    
    public String toString(){
        return name 
                + ", $"
                + String.format("%.2f", price)
                + ", "
                + quantity 
                +" units, Total: $"
                + String.format("%.2f", totalValueInStock());
    }
    
}
