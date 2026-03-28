class CoffeeShop_Runner {

    public static void main(String[] args) 
	{

        CoffeeShop.shopName();

        CoffeeShop.customer("Ev");

        double price = CoffeeShop.coffeePrice();
        System.out.println("Coffee Price: " + price);

        double total = CoffeeShop.finalBill(price);
        System.out.println("Final Bill: " + total);
    }
}