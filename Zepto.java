class Zepto {

    String itemName;
    int quantity;
    double amount;
    boolean fastDelivery;

    public Zepto() {
    }

    public Zepto(String itemName, int quantity, double amount, boolean fastDelivery) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.amount = amount;
        this.fastDelivery = fastDelivery;
        System.out.println("*************************");
    }

    public Zepto(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
		System.out.println("*************************");
    }

    public Zepto(String itemName) {
        this.itemName = itemName;
		System.out.println("*************************");
        
    }

    public void display() {
        System.out.println(itemName);
        System.out.println(quantity);
        System.out.println(amount);
        System.out.println(fastDelivery);

    }
}