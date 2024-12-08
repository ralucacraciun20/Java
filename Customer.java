public class Customer {
        private String name;

        public Customer(String name) {
            this.name = name;
        }

        public void placeOrder(String coffeeType) {
            System.out.println(name + " is placing an order for " + coffeeType);
            CoffeeShopManager coffeeShopManager = CoffeeShopManager.getInstance();
            coffeeShopManager.processOrder(coffeeType);
            Coffee coffee = CoffeeFactory.createCoffee(coffeeType);
            if (coffee != null) {
                coffee.prepare();
            }
        }
    }

