import java.util.ArrayList;

class Testing {

    public static void main(String[] args) {

        CafeUtil utilities = new CafeUtil();
        double[] orderArray = {2.50, 1.50, 4.0};
        String[] menuArray = {"drip coffee", "cappuccino", "latte", "mocha"};
        ArrayList<String> customerArray = new ArrayList<String>();

        customerArray.add("Billy");
        customerArray.add("Bobby");
        customerArray.add("Fred");

        utilities.getStreakGoal(10);
        utilities.getOrderTotal(orderArray);
        utilities.displayMenu(menuArray);
        utilities.printPriceChart("Columbian Coffee Grounds", 15.0, 3);
        utilities.addCustomer(customerArray);
    }
}