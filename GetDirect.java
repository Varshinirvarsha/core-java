class GetDirect {

    static int checkItem(String itemName) {

        int price = 0;

        if ("Burger" == itemName) {
            System.out.println("Item : " + itemName);
            price = 99;
            return price;
        }
        else if ("Pizza" == itemName) {
            System.out.println("Item : " + itemName);
            price = 199;
            return price;
        }
        else if ("Pasta" == itemName) {
            System.out.println("Item : " + itemName);
            price = 149;
            return price;
        }
        else if ("Sandwich" == itemName) {
            System.out.println("Item : " + itemName);
            price = 79;
            return price;
        }
        else if ("Fries" == itemName) {
            System.out.println("Item : " + itemName);
            price = 69;
            return price;
        }
        else if ("Wrap" == itemName) {
            System.out.println("Item : " + itemName);
            price = 89;
            return price;
        }
        else if ("Shake" == itemName) {
            System.out.println("Item : " + itemName);
            price = 59;
            return price;
        }
        else if ("Noodles" == itemName) {
            System.out.println("Item : " + itemName);
            price = 129;
            return price;
        }
        else if ("Momos" == itemName) {
            System.out.println("Item : " + itemName);
            price = 110;
            return price;
        }
        else if ("Roll" == itemName) {
            System.out.println("Item : " + itemName);
            price = 95;
            return price;
        }
        else if ("Coffee" == itemName) {
            System.out.println("Item : " + itemName);
            price = 45;
            return price;
        }
        else if ("Tea" == itemName) {
            System.out.println("Item : " + itemName);
            price = 25;
            return price;
        }
        else {
            System.out.println("Item not available");
            return price;
        }
    }



    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("Burger" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }
        else if ("Pizza" == itemName) {
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
        else if ("Fries" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }
        else if ("Wrap" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }
        else if ("Shake" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }
        else if ("Noodles" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }
        else if ("Momos" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }
        else if ("Roll" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }
        else if ("Coffee" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }
        else if ("Tea" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }
        else {
            System.out.println("Invalid item");
            return totalPrice;
        }
    }
}