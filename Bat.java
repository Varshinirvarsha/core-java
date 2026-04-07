class Bat {
       static void start() {
           System.out.println("Bat Details");
              type("Cricket Bat");
    }
static int weight() {
   System.out.println("Checking weight");
      return 1200;
  }
    static void type(String type) 
	{
        System.out.println("Type: " + type);
        int wei= weight();
        System.out.println("Weight: " + wei);
  }
}

