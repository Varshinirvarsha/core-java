class GetDirectRunner {

    public static void main(String[] args) {

        int price = 0;

        price = GetDirect.checkItem("Burger");
        System.out.println("Price : " + price);
        totalPrice = GetDirect.checkItem("Burger", price, 2);
        System.out.println("Total price : " + totalPrice);

        price = GetDirect.checkItem("Pizza");
        System.out.println("Price : " + price);
        totalPrice = GetDirect.checkItem("Pizza", price, 1);
        System.out.println("Total price : " + totalPrice);


    }
}