class ZeptoRunner {
    public static void main(String[] args) {

	System.out.println("zepto delveriy is allowable");
	
        Zepto z1 = new Zepto("Milk", 2, 60.5, true);
		        z1.display();
		
		
        Zepto z2 = new Zepto("Bread", 1);
		        z1.display();
				
        Zepto z3 = new Zepto("Eggs");
		        z1.display();
				
				System.out.println("Eggs are handed");
				
    }
}