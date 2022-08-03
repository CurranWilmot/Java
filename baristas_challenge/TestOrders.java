import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items

        Item item1 = new Item("mocha", 3.34);
        Item item2 = new Item("latte", 423.99);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("capuccino", 5.21);

    
        // Order variables -- order1, order2 etc.

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Bob");
        Order order4 = new Order("James");
        Order order5 = new Order("Stef");

        System.out.println(order1.getName());
        System.out.println(order2.getName());
        System.out.println(order3.getName());
        System.out.println(order4.getName());
        System.out.println(order5.getName());

        order4.addItem(item2);
        order4.addItem(item4);
        order5.addItem(item1);

        System.out.println(order4.getItems());
        System.out.println(order5.getItems());

        order1.setReady(true);
        order2.setReady(false);
        
        System.out.println(order1.isReady());
        System.out.println(order2.isReady());
        System.out.println(order3.isReady());

        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
    }
}