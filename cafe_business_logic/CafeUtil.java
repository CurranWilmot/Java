import java.util.ArrayList;
import java.util.Arrays;



public class CafeUtil {


    public int getStreakGoal(int numWeeks){
        int totalDrinks = 0;
        for(int i = 1; i <= numWeeks; i++){
            totalDrinks += i;
        }
        return totalDrinks;
    }

    public double getOrderTotal(double[] prices){
        double totalPrice = 0.0;
        for(int i = 0; i < prices.length; i++){
            totalPrice += prices[i];
        }
        return totalPrice;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
        // for(String drinkType : menuItems){
        //     System.out.println(drinkType);
        // }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("There are " + customers.size() + " people in front of you");
        customers.add(userName);
    }

}