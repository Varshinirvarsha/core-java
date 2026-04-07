class KFC {

    static int checkItem(String itemName) {

        int price = 0;

        if ("ZingerBurger" == itemName) {
            System.out.println("Item : " + itemName);
            price = 199;
            return price;
        }

        else if ("ChickenBucket" == itemName) {
            System.out.println("Item : " + itemName);
            price = 499;
            return price;
        }

        else if ("PopcornChicken" == itemName) {
            System.out.println("Item : " + itemName);
            price = 179;
            return price;
        }

        else if ("ChickenRoll" == itemName) {
            System.out.println("Item : " + itemName);
            price = 149;
            return price;
        }

        else if ("FrenchFries" == itemName) {
            System.out.println("Item : " + itemName);
            price = 109;
            return price;
        }

        else if ("ChickenStrips" == itemName) {
            System.out.println("Item : " + itemName);
            price = 229;
            return price;
        }

        else if ("HotWings" == itemName) {
            System.out.println("Item : " + itemName);
            price = 259;
            return price;
        }

        else if ("Krushers" == itemName) {
            System.out.println("Item : " + itemName);
            price = 99;
            return price;
        }

        else if ("Pepsi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 79;
            return price;
        }

        else if ("ChickenMeal" == itemName) {
            System.out.println("Item : " + itemName);
            price = 329;
            return price;
        }

        else if ("VegBurger" == itemName) {
            System.out.println("Item : " + itemName);
            price = 129;
            return price;
        }

        else if ("RiceBowl" == itemName) {
            System.out.println("Item : " + itemName);
            price = 159;
            return price;
        }

        else {
            System.out.println("Item not available");
            return price;
        }
    }



    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("ZingerBurger" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenBucket" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("PopcornChicken" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenRoll" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("FrenchFries" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenStrips" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("HotWings" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Krushers" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Pepsi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenMeal" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("VegBurger" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("RiceBowl" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else {
            return totalPrice;
        }
    }
}