class DoorDashRunner {

    public static void main(String[] args) {

        int price = 0;

        price = DoorDash.checkItem("BurgerMeal");
        System.out.println("Price of BurgerMeal : " + price);
        totalPrice = DoorDash.checkItem("BurgerMeal", price, 2);
        System.out.println("Total price : " + totalPrice);

        price = DoorDash.checkItem("PizzaCombo");
        System.out.println("Price of PizzaCombo : " + price);
        totalPrice = DoorDash.checkItem("PizzaCombo", price, 1);
        System.out.println("Total price : " + totalPrice);

         price = DoorDash.checkItem("FriesBox");
        System.out.println("Price of FriesBox : " + price);
        totalPrice = DoorDash.checkItem("FriesBox", price, 5);
        System.out.println("Total price : " + totalPrice);

    }
}