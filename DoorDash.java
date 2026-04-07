class DoorDash {

    static int checkItem(String itemName) {

        int price = 0;

        if ("BurgerMeal" == itemName) {
            System.out.println("Item : " + itemName);
            price = 180;
            return price;
        }

        else if ("PizzaCombo" == itemName) {
            System.out.println("Item : " + itemName);
            price = 320;
            return price;
        }

        else if ("SandwichMeal" == itemName) {
            System.out.println("Item : " + itemName);
            price = 140;
            return price;
        }

        else if ("PastaBox" == itemName) {
            System.out.println("Item : " + itemName);
            price = 210;
            return price;
        }

        else if ("WrapCombo" == itemName) {
            System.out.println("Item : " + itemName);
            price = 160;
            return price;
        }

        else if ("FriesBox" == itemName) {
            System.out.println("Item : " + itemName);
            price = 90;
            return price;
        }

        else if ("ChickenBucket" == itemName) {
            System.out.println("Item : " + itemName);
            price = 450;
            return price;
        }

        else if ("VegMeal" == itemName) {
            System.out.println("Item : " + itemName);
            price = 130;
            return price;
        }

        else if ("RiceCombo" == itemName) {
            System.out.println("Item : " + itemName);
            price = 150;
            return price;
        }

        else if ("NoodlesBox" == itemName) {
            System.out.println("Item : " + itemName);
            price = 145;
            return price;
        }

        else if ("DessertBox" == itemName) {
            System.out.println("Item : " + itemName);
            price = 120;
            return price;
        }

        else if ("ColdDrink" == itemName) {
            System.out.println("Item : " + itemName);
            price = 60;
            return price;
        }

        else {
            return price;
        }
    }



    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("BurgerMeal" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("PizzaCombo" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("SandwichMeal" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("PastaBox" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("WrapCombo" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("FriesBox" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenBucket" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("VegMeal" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("RiceCombo" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("NoodlesBox" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("DessertBox" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ColdDrink" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else {
            return totalPrice;
        }
    }
}