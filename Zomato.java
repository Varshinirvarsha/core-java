class Zomato {

    String restaurantName;
    String foodItem;
    int price;
    boolean isDelivered;


    public Zomato(String restaurantName, String foodItem, int price, boolean isDelivered) {
        this.restaurantName = restaurantName;
        this.foodItem = foodItem;
        this.price = price;
        this.isDelivered = isDelivered;
        System.out.println("************restaurant ***************8");
    }

    public Zomato(String restaurantName, int price) {
        this.restaurantName = restaurantName;
        this.price = price;
		        System.out.println("**********restaurant**********");

    }

    public Zomato(String foodItem) {
        this.foodItem = foodItem;
        System.out.println("*************");
    }

    public void display() {
        System.out.println(restaurantName);
        System.out.println(foodItem);
        System.out.println(price);
        System.out.println(isDelivered);

	}
}