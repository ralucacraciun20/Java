// Singleton Pattern
class CoffeeShopManager {

    private static CoffeeShopManager instance;

    private CoffeeShopManager() {
        System.out.println("Coffee Shop Manager Initialized");
    }

    public static CoffeeShopManager getInstance() {
        if (instance == null) {
            instance = new CoffeeShopManager();
        }
        return instance;
    }

    public void processOrder(String coffeeType) {
        System.out.println("Processing Order for: " + coffeeType);
    }
}
