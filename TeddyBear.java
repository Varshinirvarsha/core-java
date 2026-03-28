class TeddyBear{

    static void storeName()
	{
        System.out.println("Welcome to Teddy Bear Gift Shop");
    }

    static void customer(String name)
	{
        System.out.println("Customer buying teddy: " + name);
    }

    static int getPrice()
	{
        return 350;
    }

    static int totalBill(int price) {
        return price + 50;
    }
}