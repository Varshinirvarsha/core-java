class HairClip {
    static int quantity() {
        System.out.println("Checking clips");
           return 6;
  }
     static void color(String brand)
	 {
        System.out.println("Color: " + brand);
        int rating= quantity();
        System.out.println("Quantity: " + rating);
    }
static void open() 
{
        System.out.println("Hair Clip Box");
        color("Black");
  }
}
