

import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items

        Item item1 = new Item("mocha", 3.34);
        Item item2 = new Item("latte", 423.99);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("capuccino", 5.21);

        item4.price = 6.18;

        System.out.println(item1.name + " " + item2.name + " " + item3.price + " " + item4.price);
    
        // Order variables -- order1, order2 etc.

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        System.out.println(order1.name);

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        System.out.println(order1);
        System.out.println(order1.total);
        //Will print 0.0 because it is the default for doubles that haven't been
        //initialized.

    
        // Application Simulations
        // Use this example code to test various orders' updates
        order2.items.add(item1);
        order2.total += item1.price;
        System.out.println(order2.items + " " + order2.total);


        order3.items.add(item4);
        order3.total += item4.price;
        System.out.println(order3.items + " " + order3.total);


        order4.items.add(item2);
        order4.total += item2.price;
        System.out.println(order4.items + " " + order4.total);


        order1.ready = true;
        System.out.println(order1.ready);

        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += 2*(item2.price);
        System.out.println(order4.items + " " + order4.total);

        order2.ready = true;
        System.out.println(order2.ready);
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
    }
}
