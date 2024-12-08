public class CoffeeShopTest {
    public static void main(String[] args) {
        // Create customers
        Customer customer1 = new Customer("Ana");
        Customer customer2 = new Customer("Maria");

        // Customers place orders
        customer1.placeOrder("Espresso");
        customer2.placeOrder("Latte");

        Customer customer3 = new Customer("Ion");
        customer3.placeOrder("Cappuccino");
    }
}

