class ZomatoRunner {
    public static void main(String[] args) {
		
        System.out.println("----Home mane---");
		
        Zomato z1 = new Zomato("Empire", "Biryani", 250, true);
		z1.display();
		
        Zomato z2 = new Zomato("Meghana", 300);
		z2.display();
		
        Zomato z3 = new Zomato("Pizza");
		z3.display();
		
		System.out.println("order Delivered");
    }
}