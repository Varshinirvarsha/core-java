class BazaarNowRunner {

    public static void main(String[] args) {

        int price = 0;
        price = BazaarNow.checkItem("RiceBag");
        System.out.println("Price of RiceBag : " + price);
        totalPrice = BazaarNow.checkItem("RiceBag", price, 2);
        System.out.println("Total price : " + totalPrice);

        price = BazaarNow.checkItem("WheatFlour");
        System.out.println("Price of WheatFlour : " + price);
        totalPrice = BazaarNow.checkItem("WheatFlour", price, 1);
        System.out.println("Total price : " + totalPrice);

        price = BazaarNow.checkItem("SugarPack");
        System.out.println("Price of SugarPack : " + price);
        totalPrice = BazaarNow.checkItem("SugarPack", price, 3);
        System.out.println("Total price : " + totalPrice);

        
    }
}