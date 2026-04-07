class KFCRunner {

    public static void main(String[] args) {

        int price = 0;
        
		price = KFC.checkItem("ChickenRoll");
        System.out.println("Price of ChickenRoll : " + price);
        totalPrice = KFC.checkItem("ChickenRoll", price, 2);
        System.out.println("Total price : " + totalPrice);

        price = KFC.checkItem("FrenchFries");
        System.out.println("Price of FrenchFries : " + price);
        totalPrice = KFC.checkItem("FrenchFries", price, 4);
        System.out.println("Total price : " + totalPrice);

    }
}