class KitchenItemsRunner {
    public static void main(String[] args) {
	
	  System.out.println("*****Kitchen Thinks");

        KitchenItems k1 = new KitchenItems("Pressure Cooker", "Prestige", 2500, true);
		k1.display();
		
        KitchenItems k2 = new KitchenItems("Knife", 300);
		k1.display();
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
        KitchenItems k3 = new KitchenItems("Pigeon");
		k1.display();
		System.out.println("-----------Cooker----------");

    }
}