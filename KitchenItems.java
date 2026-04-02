class KitchenItems {

    String itemName;
    String brand;
    int price;
    boolean isAvailable;


    
    public KitchenItems(String itemName, String brand, int price, boolean isAvailable) {
        this.itemName = itemName;
        this.brand = brand;
        this.price = price;
        this.isAvailable = isAvailable;
		System.out.println("##############################");

    }


    public KitchenItems(String itemName, int price) {
        this.itemName = itemName;
        this.price = price;
     System.out.println("################################");
    }

    public KitchenItems(String brand) {
        this.brand = brand;
		System.out.println("##################################");
        
    }

    public void display() {
        System.out.println(itemName);
        System.out.println(brand);
        System.out.println(price);
        System.out.println(isAvailable);
        
    }
}