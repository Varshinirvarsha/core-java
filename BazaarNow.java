class BazaarNow {

    static int checkItem(String itemName) {

        int price = 0;

        if ("RiceBag" == itemName) {
            System.out.println("Item : " + itemName);
            price = 520;
            return price;
        }

        else if ("WheatFlour" == itemName) {
            System.out.println("Item : " + itemName);
            price = 260;
            return price;
        }

        else if ("SugarPack" == itemName) {
            System.out.println("Item : " + itemName);
            price = 45;
            return price;
        }

        else if ("SaltPack" == itemName) {
            System.out.println("Item : " + itemName);
            price = 25;
            return price;
        }

        else if ("CookingOil" == itemName) {
            System.out.println("Item : " + itemName);
            price = 180;
            return price;
        }

        else if ("MilkPacket" == itemName) {
            System.out.println("Item : " + itemName);
            price = 28;
            return price;
        }

        else if ("Bread" == itemName) {
            System.out.println("Item : " + itemName);
            price = 35;
            return price;
        }

        else if ("EggTray" == itemName) {
            System.out.println("Item : " + itemName);
            price = 210;
            return price;
        }

        else if ("TeaPowder" == itemName) {
            System.out.println("Item : " + itemName);
            price = 95;
            return price;
        }

        else if ("CoffeePowder" == itemName) {
            System.out.println("Item : " + itemName);
            price = 140;
            return price;
        }

        else if ("Biscuits" == itemName) {
            System.out.println("Item : " + itemName);
            price = 30;
            return price;
        }

        else if ("SoapPack" == itemName) {
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

        if ("RiceBag" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("WheatFlour" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("SugarPack" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("SaltPack" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("CookingOil" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("MilkPacket" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Bread" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("EggTray" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("TeaPowder" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("CoffeePowder" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Biscuits" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("SoapPack" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else {
            return totalPrice;
        }
    }
}