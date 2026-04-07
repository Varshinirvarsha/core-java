class ZomatoRunner {

    public static void main(String[] args) {

        int price = 0;

        price = Zomato.checkItem("Biryani");
        totalPrice = Zomato.checkItem("Biryani", price, 2);
        System.out.println(totalPrice);

        price = Zomato.checkItem("FriedRice");
        totalPrice = Zomato.checkItem("FriedRice", price, 1);
        System.out.println(totalPrice);

        price = Zomato.checkItem("Noodles");
        totalPrice = Zomato.checkItem("Noodles", price, 3);
        System.out.println(totalPrice);

    }
}