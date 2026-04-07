class Shop {

    int items() {
        int size = 12;
        return size;
 }
    void category(String name)
	{
           System.out.println("Section: " + name);
              int brand = items();
                 System.out.println("Items: " + brand);
 }
void open() {
     System.out.println("Shop Details");
       category("Grocery");
    }
}