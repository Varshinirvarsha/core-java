class FoodPandaRunner {

    public static void main(String[] args) {

        int price = 0;
        price = FoodPanda.checkItem("VegFriedRice");
        System.out.println("Price of VegFriedRice : " + price);
        totalPrice = FoodPanda.checkItem("VegFriedRice", price, 2);
        System.out.println("Total price : " + totalPrice);

        price = FoodPanda.checkItem("ChickenFriedRice");
        System.out.println("Price of ChickenFriedRice : " + price);
        totalPrice = FoodPanda.checkItem("ChickenFriedRice", price, 1);
        System.out.println("Total price : " + totalPrice);

        price = FoodPanda.checkItem("PaneerRoll");
        System.out.println("Price of PaneerRoll : " + price);
        totalPrice = FoodPanda.checkItem("PaneerRoll", price, 3);
        System.out.println("Total price : " + totalPrice);


    }
}