class CoffeeShop{

    static void shopName() 
	{
        System.out.println("Welcome to Coffee Shop");
    }

    static void customer(String name) {
        System.out.println("Customer ordered coffee: " + name);
    }

    static double coffeePrice() {
        return 120.75;
    }

    static double finalBill(double price)
	{
        return price + 20;
    }
}