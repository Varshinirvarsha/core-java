class MaggiPin {

    static int checkItem(String itemName) {

        int price = 0;

        if ("MasalaMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 40;
            return price;
        }

        else if ("CheeseMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 60;
            return price;
        }

        else if ("VegMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 55;
            return price;
        }

        else if ("ButterMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 65;
            return price;
        }

        else if ("CornMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 70;
            return price;
        }

        else if ("PaneerMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 85;
            return price;
        }

        else if ("EggMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 75;
            return price;
        }

        else if ("TandooriMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 90;
            return price;
        }

        else if ("ChickenMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 110;
            return price;
        }

        else if ("PeriPeriMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 80;
            return price;
        }

        else if ("DoubleMasalaMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 95;
            return price;
        }

        else if ("JumboMaggi" == itemName) {
            System.out.println("Item : " + itemName);
            price = 120;
            return price;
        }

        else {
            System.out.println("Item not available");
            return price;
        }
    }



    static int checkItem(String itemName, int price, int noItems) {

        int totalPrice = 0;

        if ("MasalaMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("CheeseMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("VegMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ButterMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("CornMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("PaneerMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("EggMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("TandooriMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("ChickenMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("PeriPeriMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("DoubleMasalaMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else if ("JumboMaggi" == itemName) {
            totalPrice = price * noItems;
            return totalPrice;
        }

        else {
            return totalPrice;
        }
    }
}