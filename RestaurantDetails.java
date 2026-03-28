class RestaurantDetails {

   
    static String restaurantName = "Spice Garden";
    static int tables = 25;
    static float rating = 4.3f;

    public static void main(String[] args) {

       
        String managerName = "Suresh";
        double averageCost = 550.75;
        boolean homeDelivery = true;

        
        System.out.println("Restaurant Name: " + restaurantName);
        System.out.println("Number of Tables: " + tables);
        System.out.println("Rating: " + rating);

        
        System.out.println("Manager Name: " + managerName);
        System.out.println("Average Cost: " + averageCost);
        System.out.println("Home Delivery Available: " + homeDelivery);
    }
}