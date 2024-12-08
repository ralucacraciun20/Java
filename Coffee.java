
    abstract class Coffee {
        public abstract void prepare();
    }

    // Concrete Coffee classes
    class Espresso extends Coffee {
        @Override
        public void prepare() {
            System.out.println("Preparing Espresso");
        }
    }

    class Cappuccino extends Coffee {
        @Override
        public void prepare() {
            System.out.println("Preparing Cappuccino");
        }
    }

    class Latte extends Coffee {
        @Override
        public void prepare() {
            System.out.println("Preparing Latte");
        }
    }

    // CoffeeFactory to create different types of coffee
    class CoffeeFactory {
        public static Coffee createCoffee(String type) {
            switch (type.toLowerCase()) {
                case "espresso":
                    return new Espresso();
                case "cappuccino":
                    return new Cappuccino();
                case "latte":
                    return new Latte();
                default:
                    System.out.println("Unknown coffee type.");
                    return null;
            }
        }
    }
}
