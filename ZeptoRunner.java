class ZeptoRunner {

    public static void main(String[] args) {

        int price = 0;
        
        price = Zepto.checkItem("Milk");
        System.out.println("Price of one item : " + price);
	 
	    totalPrice = Zepto.checkItem("Milk", price, 2);
        System.out.println("Total price : " + totalPrice);
		
        price = Zepto.checkItem("Bread");
        System.out.println("Price of one item : " + price);
	
		
        totalPrice = Zepto.checkItem("Bread", price, 3);
        System.out.println("Total price : " + totalPrice);

        

    }
}