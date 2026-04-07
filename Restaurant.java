class Restaurant {
  
    int getQuantity() {
        int quantity = 5;
        return quantity;
    }
 void displayItem(String item) {
        System.out.println("Item Name: " + item);

        int quantity = getQuantity();
        System.out.println("Available Quantity: " + quantity);
         }
 void showMenu() {
        System.out.println("Restaurant Menu");

        displayItem("Pizza");
		}
}