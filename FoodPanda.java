class FoodPanda {

    static int checkItem(String itemName) {

        int price = 0;

        if ("VegFriedRice" == itemName) {
            System.out.println("Item : " + itemName);
            price = 120;
            return price;
        }

        else if ("ChickenFriedRice" == itemName) {
            System.out.println("Item : " + itemName);
            price = 160;
            return price;
        }

        else if ("PaneerRoll" == itemName) {
            System.out.println("Item : " + itemName);
            price = 90;
            return price;
        }

        else if ("VegBurger" == itemName) {
            System.out.println("Item : " + itemName);
            price = 80;
            return price;
        }

        else if ("ChickenBurger" == itemName) {
            System.out.println("Item : " + itemName);
            price = 110;
            return price;
        }

        else if ("FrenchFries" == itemName) {
            System.out.println("Item : " + itemName);
            price = 70;
            return price;
        }

        else if ("VegNoodles" == itemName) {
            System.out.println("Item : " + itemName);
            price = 100;
            return price;
        }

        else if ("ChickenNoodles" == itemName) {
            System.out.println("Item : " + itemName);
            price = 140;
            return price;
        }

        else if ("Pasta" == itemName) {
            System.out.println("Item : " + itemName);
            price = 130;
            return price;
        }

        else if ("Sandwich" == itemName) {
            System.out.println("Item : " + itemName);
            price = 75;
            return price;
        }

        else if ("ColdCoffee" == itemName) {
            System.out.println("Item : " + itemName);
            price = 95;
            return price;
        }

        else if ("Brownie" == itemName) {
            System.out.println("Item : " + itemName);
            price = 85;
            return price;
        }

        else {
            System.out.println("Item not available");
            return price;
        }
    }



    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("VegFriedRice" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenFriedRice" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("PaneerRoll" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("VegBurger" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenBurger" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("FrenchFries" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("VegNoodles" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenNoodles" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Pasta" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Sandwich" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ColdCoffee" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Brownie" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else {
            return totalPrice;
        }
    }
}