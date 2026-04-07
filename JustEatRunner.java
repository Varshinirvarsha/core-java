class JustEatRunner {

    public static void main(String[] args) {

        int price = 0;

        price = JustEat.checkItem("VegPizza");
        System.out.println("Price of VegPizza : " + price);
        totalPrice = JustEat.checkItem("VegPizza", price, 2);
        System.out.println("Total price : " + totalPrice);

        price = JustEat.checkItem("ChickenPizza");
        System.out.println("Price of ChickenPizza : " + price);
        totalPrice = JustEat.checkItem("ChickenPizza", price, 1);
        System.out.println("Total price : " + totalPrice);

        price = JustEat.checkItem("PaneerPizza");
        System.out.println("Price of PaneerPizza : " + price);
        totalPrice = JustEat.checkItem("PaneerPizza", price, 3);
        System.out.println("Total price : " + totalPrice);

}

}