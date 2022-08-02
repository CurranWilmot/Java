import java.util.ArrayList;
import java.util.Arrays;


public class Order{
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;

    public Order(String name, double total, boolean ready){
        this.name = name;
        this.total = total;
        this.ready = ready;
        this.items = new ArrayList<Item>();
    }

    public Order(){
        this.items = new ArrayList<Item>();
    }
}