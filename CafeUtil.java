import java.util.ArrayList;

public class CafeUtil {

    public void getStreakGoal(int amount) {
        System.out.println("----- Streak Goal Test -----");
        int total = 0;
        for(int i = 0; i <= amount; i++) {
            total += i;
        }
        System.out.println(total);
    }

    public void getOrderTotal(double[] prices) {
        System.out.println("----- Order Total Test -----");
        double total2 = 0.0;
        for( int i = 0; i < prices.length; i++) {
            total2 += prices[i];
        }
        System.out.println(total2);
    }

    public void displayMenu(String[] menuItems) {
        System.out.println("----- Display Menu Test -----");
        for(int i = 0; i<menuItems.length; i++) {
            System.out.println(String.valueOf(i) + " " + menuItems[i]);
        }
    }

    public void printPriceChart(String product, double price, int max) {
        System.out.println("----- Price Chart Test -----");
        System.out.println(product);
        for(int i = 1; i<=max; i++) {
            System.out.println(String.valueOf(i) + " - $" + (price * i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("----- Add Customer Test -----");
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        int counter = customers.size();
        System.out.println("There are " + String.valueOf(counter) + " people in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }

}