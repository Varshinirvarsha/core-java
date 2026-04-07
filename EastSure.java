class EastSure {

    static int checkItem(String itemName) {

        int price = 0;

        if ("VegBiryani" == itemName) {
            System.out.println("Item : " + itemName);
            price = 140;
            return price;
        }

        else if ("ChickenBiryani" == itemName) {
            System.out.println("Item : " + itemName);
            price = 190;
            return price;
        }

        else if ("PaneerBiryani" == itemName) {
            System.out.println("Item : " + itemName);
            price = 170;
            return price;
        }

        else if ("EggBiryani" == itemName) {
            System.out.println("Item : " + itemName);
            price = 160;
            return price;
        }

        else if ("VegMeals" == itemName) {
            System.out.println("Item : " + itemName);
            price = 120;
            return price;
        }

        else if ("ChickenMeals" == itemName) {
            System.out.println("Item : " + itemName);
            price = 180;
            return price;
        }

        else if ("FriedRice" == itemName) {
            System.out.println("Item : " + itemName);
            price = 110;
            return price;
        }

        else if ("Noodles" == itemName) {
            System.out.println("Item : " + itemName);
            price = 100;
            return price;
        }

        else if ("Manchurian" == itemName) {
            System.out.println("Item : " + itemName);
            price = 130;
            return price;
        }

        else if ("Gobi65" == itemName) {
            System.out.println("Item : " + itemName);
            price = 115;
            return price;
        }

        else if ("Chicken65" == itemName) {
            System.out.println("Item : " + itemName);
            price = 150;
            return price;
        }

        else if ("ColdDrink" == itemName) {
            System.out.println("Item : " + itemName);
            price = 60;
            return price;
        }

        else {
            System.out.println("Item not available");
            return price;
        }
    }



    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("VegBiryani" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenBiryani" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("PaneerBiryani" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("EggBiryani" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("VegMeals" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenMeals" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("FriedRice" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Noodles" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Manchurian" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Gobi65" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Chicken65" == itemName) {
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