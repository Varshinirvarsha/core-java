class McDonaldsRunner {

    public static void main(String[] args) {

        int price = 0;
        price = McDonalds.checkItem("McAlooTikki");
        totalPrice = McDonalds.checkItem("McAlooTikki", price, 2);
        System.out.println(totalPrice);

        price = McDonalds.checkItem("McVeggie");
        totalPrice = McDonalds.checkItem("McVeggie", price, 1);
        System.out.println(totalPrice);

        price = McDonalds.checkItem("McSpicyPaneer");
        totalPrice = McDonalds.checkItem("McSpicyPaneer", price, 2);
        System.out.println(totalPrice);


    }
}