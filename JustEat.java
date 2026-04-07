class JustEat {

    static int checkItem(String itemName) {

        int price = 0;

        if ("VegPizza" == itemName) {
            System.out.println("Item : " + itemName);
            price = 180;
            return price;
        }

        else if ("ChickenPizza" == itemName) {
            System.out.println("Item : " + itemName);
            price = 240;
            return price;
        }

        else if ("PaneerPizza" == itemName) {
            System.out.println("Item : " + itemName);
            price = 210;
            return price;
        }

        else if ("VegBurger" == itemName) {
            System.out.println("Item : " + itemName);
            price = 90;
            return price;
        }

        else if ("ChickenBurger" == itemName) {
            System.out.println("Item : " + itemName);
            price = 130;
            return price;
        }

        else if ("FrenchFries" == itemName) {
            System.out.println("Item : " + itemName);
            price = 70;
            return price;
        }

        else if ("VegWrap" == itemName) {
            System.out.println("Item : " + itemName);
            price = 110;
            return price;
        }

        else if ("ChickenWrap" == itemName) {
            System.out.println("Item : " + itemName);
            price = 150;
            return price;
        }

        else if ("Pasta" == itemName) {
            System.out.println("Item : " + itemName);
            price = 160;
            return price;
        }

        else if ("GarlicBread" == itemName) {
            System.out.println("Item : " + itemName);
            price = 120;
            return price;
        }

        else if ("ColdDrink" == itemName) {
            System.out.println("Item : " + itemName);
            price = 60;
            return price;
        }

        else if ("Brownie" == itemName) {
            System.out.println("Item : " + itemName);
            price = 95;
            return price;
        }

        else {
            System.out.println("Item not available");
            return price;
        }
    }



    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("VegPizza" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenPizza" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("PaneerPizza" == itemName) {
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

        else if ("VegWrap" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenWrap" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Pasta" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("GarlicBread" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ColdDrink" == itemName) {
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