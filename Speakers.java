class Speakers {

    static void brand()
	{
        System.out.println("Bluetooth Speaker Store");
    }

    static void order(String customer) {
        System.out.println("Customer ordered speaker: " + customer);
    }

    static double getCost()
	{
        return 899.50;
    }

    static double bill(double price) {
        return price + 100;
    }
}