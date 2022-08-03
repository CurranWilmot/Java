import java.util.ArrayList;
import java.util.Arrays;


public class Order{
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    

    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name){
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    //getters

    public String getName() {
        return this.name;
    }

    public boolean isReady() {
        return this.ready;
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }
    
    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    //Order methods

    public void addItem(Item item){
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready";
        }
        else{
            return "Thank you for waiting, your order will be ready soon";
        }
        // (this.ready? "Your order is ready": "Thank you for waiting, your order will be ready soon");
    }

    public double getOrderTotal(){
        double totalPrice = 0.0;
        for(Item item: this.items){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public void display(){
        System.out.println("Customer name: " + this.name);
        for(Item item: this.items){
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: " + this.getOrderTotal());
    }
}