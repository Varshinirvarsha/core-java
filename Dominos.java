class Dominos {

    static int checkItem(String itemName) {

        int price = 0;

        if ("Margherita" == itemName) {
            price = 199;
            return price;
        }

        else if ("PeppyPaneer" == itemName) {
            price = 249;
            return price;
        }

        else if ("Farmhouse" == itemName) {
            price = 299;
            return price;
        }

        else if ("VegExtravaganza" == itemName) {
            price = 349;
            return price;
        }

        else if ("CheeseBurst" == itemName) {
            price = 399;
            return price;
        }

        else if ("GarlicBread" == itemName) {
            price = 129;
            return price;
        }

        else if ("StuffedBread" == itemName) {
            price = 149;
            return price;
        }

        else if ("TacoMexicana" == itemName) {
            price = 179;
            return price;
        }

        else if ("PaneerZingy" == itemName) {
            price = 229;
            return price;
        }

        else if ("CornPizza" == itemName) {
            price = 189;
            return price;
        }

        else if ("ChocoLava" == itemName) {
            price = 99;
            return price;
        }

        else if ("Coke" == itemName) {
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

        if ("Margherita" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("PeppyPaneer" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Farmhouse" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("VegExtravaganza" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("CheeseBurst" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("GarlicBread" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("StuffedBread" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("TacoMexicana" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("PaneerZingy" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("CornPizza" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChocoLava" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("Coke" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else {
            return totalPrice;
        }
    }
}