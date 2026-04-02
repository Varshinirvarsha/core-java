class SwiggyRunner {
    public static void main(String[] args) {
	
	System.out.println("Home  Udupi");

        Swiggy s1 = new Swiggy("Udupi", "Masala Dosa", 4.5, 25);
		        s1.display();

				
        Swiggy s2 = new Swiggy("A2B", 4.2);
		        s1.display();

		
        Swiggy s3 = new Swiggy("Burger");
		        s1.display();
    }
}